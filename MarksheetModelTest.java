import java.util.*;
import java.sql.*;
public class MarksheetModelTest{

public static void main(String [] args)throws Exception{
Scanner s=new Scanner(System.in);
System.out.println("Welcome In Marksheet !!! ");  System.out.println();System.out.println();

System.out.println("If You Want To Insert Marksheet press 1");
System.out.println("If You Want To Update Marksheet press 2");
System.out.println("If You Want To Get Marksheet press 3");
System.out.println("If You Want To Get  MeritList press 4");
System.out.println("If You Want To delete Marksheet press 5");

System.out.println(); System.out.println(); System.out.println();

int choose =s.nextInt();

Marksheet m = new Marksheet();
MarksheetModel mm = new MarksheetModel();
switch(choose){
case 1:
boolean flag=mm.add(m);
if(flag){

System.out.println("Your Record Inserted Successfully.");
}
else{
System.out.println(" Sorry, Record Not Inserted.");
}
break;
case 2: 
         boolean flag1=mm.update(m);

if(flag1){
System.out.println("Record updated successfully.");
}
else{
System.out.println("Sorry,  Record not update.");
}
break;
case 3: 

  System.out.print("Enter your RollNo : ");
String rollNo1=s.next();

m.setRollNo(rollNo1);
String rno1=m.getRollNo();

Marksheet m3= mm.get(rno1);

System.out.println(m3);
System.out.println("this is case 3.");
break;
case 4 :

ArrayList al1=new ArrayList();

al1= mm.getMeritList();

System.out.println(al1); 
System.out.println("This is case 4.");
break;
case 5:

boolean  flag2=mm.delete(m);
if(flag2){
System.out.println("Your Record Deleted Succussesfully.");
}
else{

System.out.println("Sorry,Your Record is not delete.");
}
System.out.println("This is case 5.");
break;
default :
 System.out.println("Please press  no. that is less than 6 .");
}
System.out.print("If You Wants to Continue press Y  otherwise press N : ");
String c= s.next();
if(c.equals("Y") || c.equals("y")){
   /*

System.out.println("Welcome In Marksheet !!! ");  System.out.println();System.out.println();

System.out.println("If You Want To Insert Marksheet press 1");
System.out.println("If You Want To Update Marksheet press 2");
System.out.println("If You Want To Get Marksheet press 3");
System.out.println("If You Want To Get  MeritList press 4");
System.out.println("If You Want To delete Marksheet press 5");

System.out.println(); System.out.println(); System.out.println();
*/

String[] sdf= {"me","&"};
main (sdf);
choose =s.nextInt();

}
else{
s.close();

}}
}
