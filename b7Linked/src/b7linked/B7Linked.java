/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b7linked;
import java.util.*;

public class B7Linked {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        LinkedList<Integer> list = new LinkedList<Integer>();
        
        while(true){
           System.out.println("\nMENU\n1.Insert some Elements at the Specified Position\n2.Swap two elements in a linked list\n3.Iterate a LinkedList in Reverse Order\n4.Compare Two LinkedList\n5.Convert a LinkedList to ArrayList\n6.Exit\n\nEnter your choice: ");
        
           switch(sc.nextInt()){
               case 1 :
                   System.out.println("enter index position to be inserted : ");
                   int indx=sc.nextInt();
                   
                   System.out.println("enter element to be inserted : ");
                   int ele=sc.nextInt();
                   list.add(indx, ele);
                   System.out.printf("List after insertion: %s",list);
                   break;
                   
               case 2 : 
                   System.out.println("enter the elements to be swapped: ");
                   int ele1=list.indexOf(sc.nextInt());
                   int ele2=list.indexOf(sc.nextInt());
                   Collections.swap(list, ele1, ele2);
                   
                    System.out.printf("List after swap: %s",list);
                   break;
                   
               case 3 : 
                   Iterator<Integer> itr=list.descendingIterator();
                   while(itr.hasNext()){
                       System.out.println(itr.next());
                   }
                   break;
                   
               case 4 :
                   LinkedList<Integer> temp=new LinkedList<Integer>();
                   Scanner nsc=new Scanner(sc.nextLine());
                   
                   System.out.println("enter new list elements : ");
                   while(nsc.hasNextInt()){
                       temp.add(nsc.nextInt());
                   }
                   if(list.equals(temp)){
                       System.out.println("both lists are same");
                   }
                   break;
                   
               case 5:
                   ArrayList<Integer> arr= new ArrayList<Integer>(list);
                   System.out.println(arr);
                   break;
                   
               default : 
                   return;
           }
           
        }
    }
    
}
