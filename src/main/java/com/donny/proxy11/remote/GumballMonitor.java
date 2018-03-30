package com.donny.proxy11.remote;

import java.rmi.RemoteException;

/**
 * 糖果监视器
 */
public class GumballMonitor {
    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine){
        this.machine = machine;
    }

    public void report(){
        try {
            System.out.println("Gumball Monitor:" + machine.getLocation());
            System.out.println("Current inventory:" + machine.getCount() + " gumballs");
            System.out.println("Current state:" + machine.getState());
            System.out.println();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
