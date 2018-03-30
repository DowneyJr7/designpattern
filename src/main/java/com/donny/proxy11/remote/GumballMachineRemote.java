package com.donny.proxy11.remote;

import java.rmi.*;

/**
 * 远程接口
 */
public interface GumballMachineRemote extends Remote {
    State getState() throws RemoteException;

    int getCount() throws RemoteException;

    String getLocation() throws RemoteException;
}
