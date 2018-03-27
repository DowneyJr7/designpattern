package com.donny.command6;

import com.donny.command6.client.CeilingFan;
import com.donny.command6.client.GarageDoor;
import com.donny.command6.client.Light;
import com.donny.command6.client.Stereo;
import com.donny.command6.command.*;


/**
 * 宏
 */
public class RemoteLoader {
    public static void main(String[] args) {

//        remoteControlWithUndo2();
        test();
    }

    /**
     * 命令模式
     */
    public static void remoteControl(){
        RemoteControl remoteControl = new RemoteControl();

        //家电集合
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        //命令集合
        //电灯
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        //吊扇
        CeilingFanHighComand ceilingFanOn = new CeilingFanHighComand(ceilingFan);
        CeilingFanOffComand ceilingFanOff = new CeilingFanOffComand(ceilingFan);
        //车库门
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
        //音响
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand  stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }

    /**
     * 命令模式 带撤销 电灯
     */
    public static void remoteControlWithUndo1(){
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        //家电集合
        Light livingRoomLight = new Light("Living Room");

        //命令集合
        //电灯
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }

    /**
     * 命令模式 带撤销 风扇
     */
    public static void remoteControlWithUndo2(){
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanMediumComand ceilingFanMedium = new CeilingFanMediumComand(ceilingFan);
        CeilingFanHighComand ceilingFanHigh = new CeilingFanHighComand(ceilingFan);
        CeilingFanOffComand ceilingFanOff = new CeilingFanOffComand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }

    /**
     * 宏命令
     */
    public static void test(){
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light light = new Light("Living Room");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        Command[] partyOn = { lightOn, stereoOnWithCD};
        Command[] partyOff = { lightOff, stereoOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On ---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off ---");
        remoteControl.offButtonWasPushed(0);
        System.out.println("--- Pushing Macro Undo ---");
        remoteControl.undoButtonWasPushed();

    }
}
