/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a3arraylist;

import java.util.*;



public class A3Arraylist {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        
        while(true){
            System.out.println("\n----Menu---\n1.Adding elements\n2.Sorting elements\n3.Replace an element with another\n4.Removing an element\n5.Displaying all the elements\n6.Adding an element between two elements\n7.Exit\n\nEnter your choice: ");
            
            switch(sc.nextInt()){
                case 1: 
                    System.out.println("enter element to be added : ");
                    list.add(sc.nextInt());
                    System.out.println("list after element was added "+list);
                    break;
                    
                case 2 :
                    Collections.sort(list);
                     System.out.println("list after sorting "+list);
                    break;
                    
                case 3 : 
                    System.out.println("enter old and new value : ");
                    int old=sc.nextInt();
                    int newVal=sc.nextInt();
                    
                    Collections.replaceAll(list, old, newVal);
                    System.out.println("list after sorting "+list);
                    break;
                    
                case 4:
                    System.out.println("enter element to be removed : ");
                    int e=sc.nextInt();
                    list.remove(e);
                    System.out.println("list after element was remove "+list);
                    break;
                    
                case 5:
                    if(list.isEmpty()){
                        System.out.println("list is empty ");
                    }else{
                        System.out.println("list elements are : \n");
                        Iterator<Integer> itr=list.iterator();
                        while(itr.hasNext()){
                            System.out.printf("%d ",itr.next());
                        }
                    }
                
                case 6:
                    System.out.println("enter starting and ending elements : ");
                    int sidx,eidx,indx;
                    
                    sidx=list.indexOf(sc.nextInt());
                    eidx=list.indexOf(sc.nextInt());
                    
                    if(eidx-sidx!=1){
                        System.out.println("should be consequtive ");
                    }else{
                        System.out.println("enter new element to be added : ");
                        list.add(eidx,sc.nextInt());
                        System.out.println("list after element was added "+list);
                    
                    }
                    break;
                    
                default :
                    return;
            }
        }
        
    }
    
}
