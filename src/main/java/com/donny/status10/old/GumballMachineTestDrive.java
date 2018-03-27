package com.donny.status10.old;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);//总共装了5颗糖果

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();//投入25分
        gumballMachine.turnCrank();//转动曲柄

        System.out.println(gumballMachine);//4

        gumballMachine.insertQuarter();//投入25分
        gumballMachine.ejectQuarter();//要求退钱
        gumballMachine.turnCrank();//转动曲柄

        System.out.println(gumballMachine);//4

        gumballMachine.insertQuarter();//投入25分
        gumballMachine.turnCrank();//转动曲柄
        gumballMachine.insertQuarter();//投入25分
        gumballMachine.turnCrank();//转动曲柄
        gumballMachine.ejectQuarter();//要求退钱

        System.out.println(gumballMachine);//2

        gumballMachine.insertQuarter();//投入25分
        gumballMachine.insertQuarter();//投入25分
        gumballMachine.turnCrank();//转动曲柄
        gumballMachine.insertQuarter();//投入25分
        gumballMachine.turnCrank();//转动曲柄 糖果机到此已售罄
        gumballMachine.insertQuarter();//投入25分
        gumballMachine.turnCrank();//转动曲柄

        System.out.println(gumballMachine);//0
    }
}
