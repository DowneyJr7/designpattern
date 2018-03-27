package com.donny.adapter7.facade;


/**
 * 家庭影院外观
 */
public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    DVDPlayer dvd;
    CDPlayer cd;
    Projector projector;
    Screen screen;
    TheaterLights lights;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DVDPlayer dvd,
                             CDPlayer cd, Projector projector, Screen screen,
                             TheaterLights lights, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;
    }

    public void watchMovie(String movie){
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie(){
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
