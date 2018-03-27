package com.donny.iterandcomp9.composite;

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    /**
     *
     * @param allMenus 只要将最顶层的菜单组件
     */
    public Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }

    /**
     * 只需调用最顶层菜单的print()
     */
    public void pringMenu(){
        allMenus.print();
    }

    /**
     * 素食菜单
     */
    public  void printVegetarianMenu(){
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();

            try{
                if (menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e){

            }
        }
    }
}
