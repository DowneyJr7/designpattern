package com.donny.status10;

public interface State {
    /**
     * 投币
     */
    void insertQuarter();

    /**
     * 退币
     */
    void ejectQuarter();

    /**
     * 启动
     */
    void turnCrank();

    /**
     * 发糖
     */
    void dispense();
}
