import java.util.*;
class Parent 
{   public void show()
    {  System.out.println("Parent display");
    }
}
class Child extends Parent
{  public void show()
   {  System.out.println("child display");
   }
}
public class Dynamic
{  public static void main(String args[])
   {
        Parent p=new Child();
        p.show();
         
   }
}