package com.donny.iterandcomp9.composite;

import java.util.Iterator;

/**
 * 菜单组件
 */
public abstract class MenuComponent {

    //我们把“组合”方法组织在一起，即新增、删除和取得菜单组件
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }


    //这些是“操作”方法;它们被菜单项使用
    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getDescription(){
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }

    public double getPrice(){
        throw new UnsupportedOperationException();
    }
    //也是一个“操作”方法，这个方法同时被菜单和菜单项所实现
    public void print(){
        throw new UnsupportedOperationException();
    }

    public abstract Iterator createIterator();
}
