import java.util.*;
class Engine
{   public void start()
    {  System.out.println("I am Start of engine");
    }
}
class Car
{   Engine eng=new Engine();
    public void carStart()
    { eng.start();
     System.out.println("I am Car");
    }
}
public class CarEngine
{  public static void main(String args[])
   {   Car c=new Car();
        c.carStart();
   }
}//class