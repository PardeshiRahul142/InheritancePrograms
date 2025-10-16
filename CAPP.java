import java.util.*;
class Abc
{ int i,j;
  public String toString()
  { return i+" "+j;
  }
}
public class CAPP
{ public static void main(String args[])
  {
    Abc obj =new Abc();
     obj.j=1; //set value 
     obj.i=2;
     System.out.println(obj);
  
     Abc obj2=new Abc();//here no copy value 
     System.out.println(obj2);
 
     Abc obj3=obj;
     System.out.println(obj3);
    
  }
}