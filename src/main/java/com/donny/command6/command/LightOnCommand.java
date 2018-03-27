package com.donny.command6.command;

import com.donny.command6.client.Light;

/**
 * 电灯开启命令
 * 这是一个命令，所以需要实现Command接口
 */
public class LightOnCommand implements Command {
    Light light;

    /**
     * @param light 某个电灯
     */
    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
