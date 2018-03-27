package com.donny.command6.simple;

import com.donny.command6.command.Command;

/**
 * 简单的远程控制器
 */
public class SimpleRemoteControl {
    //有一个插槽持有命令，而这个命令控制着一个装置
    Command slot;

    public SimpleRemoteControl(){

    }

    /**
     * 设置插槽控制的命令。
     * @param command
     */
    public void setCommand(Command command){
        slot = command;
    }

    /**
     * 按下按钮，使得当前命令衔接插槽，并调用它的execute()
     */
    public void buttonWasPressed(){
        slot.execute();
    }
}
