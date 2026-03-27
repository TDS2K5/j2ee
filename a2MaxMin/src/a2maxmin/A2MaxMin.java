/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a2maxmin;
import java.util.*;


public class A2MaxMin {

  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeSet<Integer> number= new TreeSet<Integer>();
        
        System.out.println("enter the number of elements: ");
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            System.out.printf("enter element %d : ",i);
            int e=sc.nextInt();
            number.add(e);
        }
        System.out.println("Given set of numbers is : ");
        System.out.println(number);
        
        int sl=number.lower(number.last());
        int sm=number.higher(number.first());
        
        System.out.println("second largest number is "+ sl);
        System.out.println("second smallest number is "+ sm);
    }
    
}
