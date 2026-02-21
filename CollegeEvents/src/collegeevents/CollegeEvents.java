/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collegeevents;
import java.util.*;

enum EventType{
    WORKSHOP(250,2),HACKATHON(1000,5),QUIZ(500,4),PAPER_PRESENTATION(200,3);
    float fees;
    int max_size;
    
    EventType(float f, int m){
       
    }
}

    class Eve{
    void getData(){
         System.out.println("Enter event name: ");
         Scanner sc=new Scanner(System.in);
         String e=sc.next().toUpperCase();
         EventType select=EventType.valueOf(e);
         System.out.println(select);
    }
    }


public class CollegeEvents {

    public static void main(String[] args) {
        Eve ev=new Eve();
        Scanner sc=new Scanner(System.in);
        ev.getData();
        
    }
    
}
