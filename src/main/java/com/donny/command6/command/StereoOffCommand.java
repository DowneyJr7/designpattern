package com.donny.command6.command;

import com.donny.command6.client.Stereo;


/**
 * 音响关闭命令
 * 这是一个命令，所以需要实现Command接口
 */


public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
