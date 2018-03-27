package com.donny.status10;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();//投入25分
        gumballMachine.turnCrank();//转动曲柄

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();//投入25分
        gumballMachine.turnCrank();//转动曲柄
        gumballMachine.insertQuarter();//投入25分
        gumballMachine.turnCrank();//转动曲柄

        System.out.println(gumballMachine);
    }
}
