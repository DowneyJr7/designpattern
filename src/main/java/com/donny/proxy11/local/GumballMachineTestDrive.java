package com.donny.proxy11.local;

public class GumballMachineTestDrive {
    public static void main(String[] args) {

        GumballMachine gumballMachine = new GumballMachine("Seattle",5);
        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);

        gumballMonitor.report();

        gumballMachine.insertQuarter();//投入25分
        gumballMachine.turnCrank();//转动曲柄

        gumballMonitor.report();

        gumballMachine.insertQuarter();//投入25分
        gumballMachine.turnCrank();//转动曲柄
        gumballMachine.insertQuarter();//投入25分
        gumballMachine.turnCrank();//转动曲柄

        gumballMonitor.report();
    }
}
