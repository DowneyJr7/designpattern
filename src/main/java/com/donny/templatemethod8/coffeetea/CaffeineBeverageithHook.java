package com.donny.templatemethod8.coffeetea;

/**
 * 咖啡因饮料 带钩子
 */
public abstract class CaffeineBeverageithHook {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    /**
     * 钩子
     * @return
     */
    public boolean customerWantsCondiments() {
        return true;
    }

    public abstract void brew();

    public abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
