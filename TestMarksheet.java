
public class TestMarksheet {

    public static void main(String args[]){
   
   Marksheet m=new Marksheet ();
   
m.setRollNo("0873CS181031");
m.setName ("Mohit");
m.setPhysics (67);
m.setChemistry (79);
m.setMaths (99);

System.out.println (m.getRollNo ());
System.out.println(m.getName ());
 System.out.println(m.getPhysics ());
 System.out.println(m.getChemistry ());
System.out.println(
m.getMaths());
   }
    
}
