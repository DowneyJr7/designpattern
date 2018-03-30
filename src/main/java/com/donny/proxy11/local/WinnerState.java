package com.donny.proxy11.local;

/**
 * 赢家状态 多一颗糖
 */
public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {
        System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
        gumballMachine.dispense();//发第一颗
        if (gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.dispense();//发第二颗
            if (gumballMachine.getCount() > 0){
                gumballMachine.setState(gumballMachine.getNoQuarterState());//无币
            }else {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());//售罄
            }
        }
    }

    @Override
    public String toString() {
        return "赢家状态";
    }
}
