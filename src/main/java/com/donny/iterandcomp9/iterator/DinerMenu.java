package com.donny.iterandcomp9.iterator;

import java.util.Iterator;

/**
 * 餐厅菜单
 */
public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    private MenuItem[] menuItems;//使用数组，可以控制菜单的长度，并在取出菜单项时，无需转型

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT",
                "(fAKIN') Bacon with lettuce & tomato on whole wheat",
                true, 2.99);

        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false, 2.99);

        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad",
                false, 3.29);

        addItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false, 3.05);
    }

    /**
     * 创建菜单项，并实例化它。
     * @param name 名称
     * @param description 描述
     * @param vegetarian 素食否
     * @param price 价格
     */
    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {//检查数组是否超出它的长度限制
            System.out.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

//    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }
    /**
     * 从菜单项数组创建一个DinerMenuIterator，
     * @return 并将返回给客户
     */
    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

}
