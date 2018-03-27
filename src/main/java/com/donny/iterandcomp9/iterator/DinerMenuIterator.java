package com.donny.iterandcomp9.iterator;

import java.util.Iterator;

/**
 * 餐厅菜单的迭代器
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;//记录当前遍历的位置

    /**
     *
     * @param items 构造器需要被传入一个菜单项的数组
     */
    public DinerMenuIterator(MenuItem[] items){
        this.items = items;
    }

    /**
     * 检查我们是否已经取得数组内所有的元素
     * @return 如果还有元素待遍历，则true
     */
    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    /**
     *
     * @return 下一个项，并递增其位置
     */
    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0){
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if (items[position - 1] != null){
            for (int i = position - 1; i < (items.length - 1); i++){
                items[i] = items[i + 1];
            }
            items[items.length - 1] = null;
        }
    }
}
