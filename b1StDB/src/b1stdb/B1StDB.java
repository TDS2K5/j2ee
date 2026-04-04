package b1stdb;

import java.util.*;
import java.sql.*;

public class B1StDB {
public static void main(String[] args) {
Connection con;
PreparedStatement stmt;
Scanner sc=new Scanner(System.in);
String name,regno,dob,course,cls,adrs;
try {
Class.forName("org.postgresql.Driver");
con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","postgres");
while(true){
System.out.println("MENU\n1.Add new Student\n2. Delete aspecified students Record\n3. Update Students Address specified students Record\n4. Search for a particular Student\n5. Exit\nEnter your choice: ");

switch(sc.nextInt()){
case 1:
System.out.println("Enter regno,name,dob,course,class and adrs: ");
regno=sc.next();
name=sc.next();
dob=sc.next();
course=sc.next();
cls=sc.next();
sc.nextLine();
adrs=sc.nextLine();

stmt=con.prepareStatement("Insert into student values(?,?,?,?,?,?)");
stmt.setString(1, regno);
stmt.setString(2, name);
stmt.setString(3, dob);
stmt.setString(4, adrs);
stmt.setString(5, course);
stmt.setString(6, cls);
stmt.executeUpdate();
System.out.println("Record inserted into table");
break;
case 2:
System.out.println("Enter student id: ");
regno=sc.next();
stmt=con.prepareStatement("delete from student where stRegNo=?");
stmt.setString(1, regno);
if(stmt.executeUpdate()>0)
    System.out.println("Record deleted successfuly");
else
    System.out.printf("%s ID not found",regno);
break;
case 3:
System.out.println("Enter regno and update adrs: ");
regno=sc.next();
sc.nextLine();
adrs=sc.nextLine();
stmt=con.prepareStatement("Update student set stAddr=? where stRegNo=?");
stmt.setString(1,adrs);
stmt.setString(2, regno);
if(stmt.executeUpdate()>0)
    System.out.println("Record updated successfuly");
else
    System.out.printf("%s ID Not found",regno);
break;
case 4:
System.out.println("Enter a regno: ");
regno=sc.next();
stmt=con.prepareStatement("select * from student where stRegNo=?");
stmt.setString(1,regno);
ResultSet res=stmt.executeQuery();
if(res.next())
    System.out.printf("Student details\nStudent RegNo: %s\nName: %s\nDOB: %s\nAdrs: %s\nClass: %s\nCourse: %s",res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6));
else
    System.out.printf("%s ID Not found",regno);
break;

case 5: return;
}
}
}

catch (Exception e) {
System.out.println(e.getMessage());
}
}
}