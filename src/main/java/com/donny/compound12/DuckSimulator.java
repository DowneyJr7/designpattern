package com.donny.compound12;

import com.donny.strategy1.Quack;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    private void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rebberDuck = new RedheadDuck();

        System.out.println("Duck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rebberDuck);
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
