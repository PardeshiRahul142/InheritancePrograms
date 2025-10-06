import java.util.*;
public class HashSetEx
{  public static void main(String args[]) 
   {
    Set hs=new HashSet();
    hs.add(10);
    hs.add(30);
    hs.add(10);
    hs.add(40);
    hs.add(50);
    hs.add(60);
 
   for(Object h:hs)
   { System.out.println(h);
   }

   }//main
}//class