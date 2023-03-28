package proxy.gumball_machine;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {
    int getCount() throws RemoteException;
    String getLocation() throws RemoteException;
    State getState() throws RemoteException; // 원시타입이 아니기 때문에 Serializable이어야 한다.
}
