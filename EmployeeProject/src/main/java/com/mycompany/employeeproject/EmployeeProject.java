/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeeproject;

import java.util.Scanner;

enum Gender{
    MALE,FEMALE,OTHER
}

enum EmployeeType{
    FULLTIME(10),PARTTIME(20),CONTRACT(30);
    
    int value;
    
    EmployeeType(int val){
        value=val;
    }
}

interface EmployeeSalary{
    void CalculateSalary();
}

class Employee implements EmployeeSalary{
    
    int empId;
    String name;
    float gross,net,hra;
    Gender gender;
    EmployeeType type;
    static Scanner sc=new Scanner(System.in);
    
    void getData(){
try{
System.out.println("Enter empid, name, gross: ");
empId=sc.nextInt();
name=sc.next();
gross=sc.nextFloat();
System.out.println("Enter gender: ");
String g=sc.next(); //it is for gender
gender=Gender.valueOf(g.toUpperCase()); //if enter gender is not gender object
//then it will throws an exception. so enclose it inside try catch
System.out.println("Enter employee type: ");
type=EmployeeType.valueOf(sc.next().toUpperCase());
}
catch(Exception e){
System.out.println("Invalid gender or type");
}
}
    

    @Override
    public void CalculateSalary() {
        hra=gross*0.1f;
        net=gross+hra;
        
    }
    void display(){
System.out.printf("Name: %s\nGender: %s\nEmpType value:%d",name,gender,type.value);
//or

}
    
}


/**
 *
 * @author tanishk
 */
public class EmployeeProject {

    public static void main(String[] args) {
        Employee emp=new Employee();
emp.getData();
emp.CalculateSalary();
emp.display();
    }
}
