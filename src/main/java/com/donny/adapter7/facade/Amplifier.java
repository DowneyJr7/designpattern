package com.donny.adapter7.facade;

public class Amplifier {
    Tuner tuner;
    DVDPlayer dvd;
    CDPlayer cd;
    int volume;

    public void on(){
        System.out.println("Top-O-Line Amplifier on");
    }

    public void off(){
        System.out.println("Top-O-Line Amplifier off");
    }

    public void setCd(CDPlayer cd) {
        this.cd = cd;
    }

    public void setDvd(DVDPlayer dvd) {
        this.dvd = dvd;
        System.out.println("Top-O-Line Amplifier setting DVD player to Top-O-Line DVD Player");
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setSurroundSound() {
        System.out.println("Top-O-Line Amplifier surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Top-O-Line Amplifier setting volume to 5");
    }
}
