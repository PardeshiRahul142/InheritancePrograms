import java.util.*;
public class Revplace
{  public static void main(String args[])
   {
    int a[]={3,4,5};
    
    for(int i=0;i<a.length;i++) 
    {
      int f=1;
      int num=a[i];

      for(int j=1;j<=num;j++)
      { f=f*j;
      }
      a[i]=f;
      System.out.println(a[i]);
    }
    System.out.println("after replacing factor");
   // for(int i=0;i<a.length;i++)
   // { System.out.println(a[i]);
   // }

   }
}//class