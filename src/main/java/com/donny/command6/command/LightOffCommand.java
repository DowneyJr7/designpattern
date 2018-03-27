package com.donny.command6.command;

import com.donny.command6.client.Light;

/**
 * 电灯关闭命令
 * 这是一个命令，所以需要实现Command接口
 */
public class LightOffCommand implements Command {
    Light light;

    /**
     * @param light 某个电灯
     */
    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
