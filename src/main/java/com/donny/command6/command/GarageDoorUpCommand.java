package com.donny.command6.command;

import com.donny.command6.client.GarageDoor;


/**
 * 库门开启命令
 * 这是一个命令，所以需要实现Command接口
 */


public class GarageDoorUpCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor){
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {

    }
}
