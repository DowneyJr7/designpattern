package com.donny.command6.simple;

import com.donny.command6.client.GarageDoor;
import com.donny.command6.client.Light;
import com.donny.command6.command.GarageDoorUpCommand;
import com.donny.command6.command.LightOnCommand;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("");
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor("");
        GarageDoorUpCommand garagerOpen = new GarageDoorUpCommand(garageDoor);
        remote.setCommand(garagerOpen);
        remote.buttonWasPressed();
    }
}
