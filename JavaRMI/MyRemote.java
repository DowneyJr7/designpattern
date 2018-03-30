import java.rmi.*;

/**
 * 远程接口
 */
public interface MyRemote extends Remote{
    String sayHello() throws RemoteException;
}
