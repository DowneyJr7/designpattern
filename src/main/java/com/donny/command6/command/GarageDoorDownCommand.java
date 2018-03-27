package com.donny.command6.command;

import com.donny.command6.client.GarageDoor;


/**
 * 库门关闭命令
 * 这是一个命令，所以需要实现Command接口
 */


public class GarageDoorDownCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {

    }
}
