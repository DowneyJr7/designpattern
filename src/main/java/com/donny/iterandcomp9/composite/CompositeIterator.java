package com.donny.iterandcomp9.composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
    Stack stack = new Stack();

    /**
     * 将我们要遍历的顶层组合的迭代器传入。我们吧它抛进一个堆栈数据结构中
     * @param iterator
     */
    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator iterator = (Iterator) stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }

    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }

    /**
     * 我们不支持删除，这里只有遍历
     */
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
