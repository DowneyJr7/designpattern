package com.donny.adapter7.enumiterator;

import java.util.Enumeration;
import java.util.Iterator;


/**
 * 迭代器
 */


public class IteratorEnumeration implements Enumeration {
    Iterator iterator;

    public IteratorEnumeration(Iterator iterator){
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
