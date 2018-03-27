package com.donny.command6.command;

/**
 * 命令 对象
 */
public interface Command {

    /**
     * 执行
     */
    public void execute();

    /**
     * 撤销
     */
    public void undo();
}
