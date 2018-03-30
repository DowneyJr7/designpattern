package com.donny.proxy11.remote;

/**
 * 无币状态（可投币）
 */
public class NoQuarterState implements State {
    //transient 告诉jvm不要序列化该字段
    transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    /**
     * 如果有人投入了25分钱，然后改变机器的状态到HasQuarterState
     */
    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    /**
     * 如果没给钱，就不能要求退钱
     */
    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    /**
     * 如果没给钱，就不能要求发糖
     */
    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    /**
     * 如果没给钱，就不能要求发糖
     */
    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public String toString() {
        return "无币状态";
    }
}
