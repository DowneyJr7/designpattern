package com.donny.proxy11.local;

import java.util.Random;

/**
 * 有币状态（可退币）
 */
public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    /**
     * 已有币，不可再投
     */
    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    /**
     * 退币，并将状态转换到NoQuarterState状态
     */
    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    /**
     * 可启动
     */
    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        //如果赢了，而且有足够的糖果可以让他一次得到两颗的话，就进入WinnerState状态
        if ((winner == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {//否则，就进入SoldState状态，就跟平常一样
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    /**
     * 没有糖果分发
     */
    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String toString() {
        return "有币状态";
    }
}
