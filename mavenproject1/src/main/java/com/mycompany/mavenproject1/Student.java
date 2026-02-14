/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;
public class Student {
String name, result;
int m1,m2,m3,total;
float avg;
    public Student(String name, int m1, int m2, int m3) {

    this.name = name;
    this.m1 = m1;
    this.m2 = m2;
    this.m3 = m3;
    }
void calculate(){
    total=m1+m2+m3;
    avg=total/3.0f;
    if(avg>9)
    result="A+";
    else if(avg>8)
    result="B+";
    else
    result="Fail";
    }
void display(){
System.out.printf("Name: "+name+"\ntotal: "+total+"\nResult: "+result);
}
public static void main(String[] args) {
String name;
int m1,m2,m3;
Scanner sc=new Scanner(System.in);
System.out.println("Enter student name,m1,m2,m3: ");
name=sc.next();
m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();

Student s=new Student(name,m1,m2,m3);
s.calculate();
s.display();
}
}