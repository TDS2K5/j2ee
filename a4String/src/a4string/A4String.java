/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a4string;
import java.util.*;

public class A4String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the sentence : ");
        String []words=sc.nextLine().split("\\s+");
        String toggle="";
        
        //for each word
        for(String word:words){
            if(word.length()%2==0){
                
                String temp="";
                
                for(int i=0;i<word.length();i+=2){
                    temp=temp+word.charAt(i+1)+word.charAt(i);
                }
                System.out.println(temp);
            }
            for(char c:word.toCharArray()){
                if(Character.isUpperCase(c)){
                    toggle+=Character.toLowerCase(c);
                }else{
                    toggle+=Character.toUpperCase(c);
                }
            }toggle+="  ";
        }
        System.out.println(toggle);
        
        
    }
    
}
