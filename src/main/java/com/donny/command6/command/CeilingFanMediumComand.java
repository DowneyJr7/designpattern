package com.donny.command6.command;

import com.donny.command6.client.CeilingFan;


/**
 * 吊扇中开命令
 * 这是一个命令，所以需要实现Command接口
 */


public class CeilingFanMediumComand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanMediumComand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        switch (prevSpeed){
            case CeilingFan.HIGH:
                ceilingFan.high();
                break;
            case CeilingFan.MEDIUM:
                ceilingFan.medium();
                break;
            case CeilingFan.LOW:
                ceilingFan.low();
                break;
            case CeilingFan.OFF:
                ceilingFan.off();
                break;
        }
    }
}
