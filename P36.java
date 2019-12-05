import java.lang.*;
import java.util.*;
class P36
{
  public static void main(String args[])
  {
    Calculator c=new Calculator();
    int res1=c.powerInt(12,10);
    double res2=c.powerDouble(2,3);
    System.out.println("POWER OF INTEGER IS "+res1);
    System.out.println("POWER OF DOUBLE IS "+res2);
  }
}
class Calculator
{
  public static int powerInt(int num1,int num2)
  {
     double res=Math.pow(num1,num2);
     return (int)res;
  }
  public static double powerDouble(int num1,int num2)
  {
     double res=Math.pow(num1,num2);
     return res;
  }
}