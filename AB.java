import java.util.*;
class AAA
{ 
  AAA(int a)
  { System.out.println("I am AAA"+a);
  }
}
class BBB extends AAA
{
  BBB(int b)
  { super(20);
    System.out.println("I am BBB"+b);
  }
}
class CCC extends BBB
{
   CCC(int c)
   { super(30);
     System.out.println("I am CCC"+c);
   }
}

public class AB
{ public static void main(String args[])
  { CCC b=new CCC(10);
  }
}