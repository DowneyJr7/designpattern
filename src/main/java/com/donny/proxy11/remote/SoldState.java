package com.donny.proxy11.remote;

/**
 * 在售状态
 */
public class SoldState implements State {
    //transient 告诉jvm不要序列化该字段
    transient GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Thrning twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        gumballMachine.dispense();
        if (gumballMachine.getCount() > 0){//发糖，改为无币状态
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else {
            System.out.println("Oops, out of gumballs!");//无糖，改为售罄状态
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public String toString() {
        return "在售状态";
    }
}
