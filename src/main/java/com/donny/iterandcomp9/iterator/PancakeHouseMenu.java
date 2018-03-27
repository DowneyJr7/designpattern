package com.donny.iterandcomp9.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 煎饼屋菜单
 */
public class PancakeHouseMenu implements Menu {
    private ArrayList menuItems;//使用一个ArrayList存储

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true, 2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with scrambled eggs, sausage",
                false, 2.99);

        addItem("Blueberry Pancake",
                "Pancakes made with fresh blueberries",
                true, 3.49);

        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true, 2.99);
    }

    /**
     * 创建菜单项，将它加入ArrayList中
     * @param name 名称
     * @param description 描述
     * @param vegetarian 素食否
     * @param price 价格
     */
    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    //    public ArrayList getMenuItems() {
//        return menuItems;
//    }
    @Override
    public Iterator createIterator() {
//        return new PancakeHouseMenuIterator(menuItems);
        return menuItems.iterator();//不创建自己的迭代器，而是调用ArrayList的iterator()方法
    }
}
