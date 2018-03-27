package com.donny.command6.client;

/**
 * Stereo:音响
 */
public class Stereo {
    String name;

    public Stereo(String name){
        this.name = name;
    }

    public void on(){
        System.out.println(name + "Stereo is On");
    }

    public void off(){
        System.out.println(name + "Stereo is Off");
    }

    public void setCD(){
        System.out.println(name + "Stereo is CD input");
    }

    public void setDVD(){
        System.out.println(name + "Stereo is DVD");
    }

    public void setRadio(){
        System.out.println(name + "Stereo is Radio");
    }

    public void setVolume(int volume){
        System.out.println(name + "Volume set to " + volume);
    }
}
