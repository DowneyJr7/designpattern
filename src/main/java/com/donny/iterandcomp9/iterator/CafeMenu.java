package com.donny.iterandcomp9.iterator;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * 咖啡厅菜单
 */
public class CafeMenu implements Menu {
    //散列表存储
    private Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettucem tomato, and fries",
                true, 3.99);
        addItem("Soup of the day",
                "A cup of he soup of the day, with a side salad",
                false,3.69);
        addItem("Burrito",
                "A large burrito, with whole pinto beans, salsa, guacamole",
                true, 4.29);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();//取值部分的迭代器
    }
}
