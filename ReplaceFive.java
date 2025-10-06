import java.util.*;
public class ReplaceFive
{  public static void main(String args[])
   {
     int a[]={10,12,15,17,20};
 
     for(int i=0 ;i<a.length;i++)
     {
       if(a[i] % 5 ==0)
       { a[i]=5;
       }
     }
      System.out.println("After replcing element");
      for(int i=0;i<a.length;i++)
      { System.out.println(a[i]);
      }
   }
}