import java.util.*;
import java.sql.*;
public class MarksheetModel{
Scanner s=new Scanner(System.in);

public boolean add(Marksheet m){
Scanner s=new Scanner(System.in);

System.out.print("Enter your Roll No :  ");
String rollNo=s.next();

System.out.print("Enter your Name : ");
String name=s.next();

System.out.print("Enter your Physics Marks : ");
int physics=s.nextInt();

System.out.print("Enter your Chemistry Marks : ");
int chemistry=s.nextInt();

System.out.print("Enter your Mathematics Marks : ");
int maths=s.nextInt();


m.setRollNo(rollNo);
m.setName(name);
m.setPhysics(physics);
m.setChemistry(chemistry);
m.setMaths(maths);

String rno=m.getRollNo();
String names=m.getName();
int phy=m.getPhysics();
int che = m.getChemistry();
int ma=m.getMaths();



return true;
}


public boolean update(Marksheet m){

Scanner s=new Scanner (System.in);

System.out.print("Enter your RollNo : ");
String rollNo=s.next();
System.out.print("Enter your Name : ");
String name =s.next();
System.out.print("Enter your Physics Marks : ");
int physics = s.nextInt();
System.out.print("Enter your Chemistry Marks : ");
int chemistry = s.nextInt();
System.out.print("Enter your Mathematics Marks : ");
int maths=s.nextInt();


m.setRollNo(rollNo);
m.setName(name);
m.setPhysics(physics);
m.setChemistry(chemistry);
m.setMaths(maths);

String rno=m.getRollNo();
String names=m.getName();
int phy=m.getPhysics();
int che = m.getChemistry();
int ma=m.getMaths();


return true;
}
public Marksheet get(String rno){

Marksheet m2= new Marksheet();

return m2;
}
public ArrayList getMeritList(){


ArrayList al = new ArrayList();

return al;
}
public boolean delete(Marksheet m){
System.out.print("Please Enter Your Roll No. : ");
String rollNo=s.next();
m.setRollNo(rollNo);
String rollNo1= m.getRollNo();


return true;
}
}
