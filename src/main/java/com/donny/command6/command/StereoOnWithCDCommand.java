package com.donny.command6.command;

import com.donny.command6.client.Stereo;


/**
 * 音响CD命令
 * 这是一个命令，所以需要实现Command接口
 */


public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
