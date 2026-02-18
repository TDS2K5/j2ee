/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeeproject;

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



/**
 *
 * @author tanishk
 */
public class EmployeeProject {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
