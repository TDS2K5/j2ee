import java.util.Scanner;
import java.rmi.*;
public class Client {
public static void main(String[] args) {
try{
Scanner sc=new Scanner(System.in);
System.out.println("Enter income: ");
int income=sc.nextInt();
Methods
m=(Methods)Naming.lookup("rmi://localhost:1099/serverObj");
//copy this from server
double tax=m.incomeTax(income);
System.out.printf("Income: %d\nTax: %.2f",income,tax);
}catch(Exception e){
System.out.println(e);
}
}
}