package com.donny.proxy11.remote;

import java.io.Serializable;

/**
 * 状态接口 可序列化
 */
public interface State extends Serializable {
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
