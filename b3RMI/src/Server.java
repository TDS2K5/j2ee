import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
public class Server extends UnicastRemoteObject implements Methods{

public Server() throws RemoteException {}
public double incomeTax(int income) throws RemoteException {
if(income<=300000)
    return 0;
if(income<=600000)
    return income*0.05;
if(income<=900000)
    return income*0.1;
if(income<=1200000)
    return income*0.15;
if(income<=1500000)
    return income*0.2;
return income*0.3;
}
public static void main(String[] args) {
try{
LocateRegistry.createRegistry(1099);
Server s=new Server();
Naming.rebind("rmi://localhost:1099/serverObj", s);
//it should be like this
//if you change the port number... thenm change it here too
System.out.println("Server is active");
}catch(Exception e){
System.out.println(e);
}
}
}