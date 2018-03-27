package com.donny.status10;

/**
 * 糖果机
 */
public class GumballMachine {
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State state = soldState;
    private int count = 0;

    public GumballMachine(int count){
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        winnerState = new WinnerState(this);
        soldState = new SoldState(this);
        this.count = count;
        if (count > 0){
            state = noQuarterState;
        }
    }

    /**
     * 当有25分钱投进来，就会执行这里
     */
    public void insertQuarter(){
        state.insertQuarter();
    }

    /**
     * 现在，如果顾客试着退回25分钱
     */
    public void ejectQuarter(){
        state.ejectQuarter();
    }

    /**
     * 顾客试着转动曲柄
     */
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    /**
     * 发放糖果
     */
    public void dispense() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0){
            count = count - 1;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "糖果数量：" + count;
    }
}
