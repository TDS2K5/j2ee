

import java.rmi.*;

public interface Methods extends Remote{
    public double incomeTax(int income) throws RemoteException;
}
