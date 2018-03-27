package com.donny.command6.client;

/**
 * GarageDoor:车库门
 */
public class GarageDoor {
    String name;

    public GarageDoor(String name){
        this.name = name;
    }

    public void up(){
        System.out.println("GarageDoor is Up");
    }

    public void down(){
        System.out.println("GarageDoor is Down");
    }

    public void stop(){
        System.out.println("GarageDoor is Stop");
    }

    public void lightOn(){
        System.out.println("GarageDoor is lightOn");
    }

    public void lightOff(){
        System.out.println("GarageDoor is lightOff");
    }
}
