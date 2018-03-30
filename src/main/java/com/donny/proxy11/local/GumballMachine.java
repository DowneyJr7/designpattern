package com.donny.proxy11.local;

/**
 * 糖果机
 */
public class GumballMachine {
    private String location;

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State state = soldState;
    private int count = 0;

    public GumballMachine(String location, int count){
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.location = location;
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

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("状态:");
        buffer.append(state);
        buffer.append("\t数量：");
        buffer.append(count);
        return buffer.toString();
    }
}
