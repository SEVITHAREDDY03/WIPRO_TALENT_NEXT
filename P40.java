import java.util.*;
class P40
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Person name is ");
    String s=sc.next();
    System.out.println("Person age is ");
    int a=sc.nextInt();
    System.out.println("Person salary is ");
    double sa=sc.nextDouble();
    System.out.println("Person  join year is ");
    int y=sc.nextInt();
    System.out.println("Person insurance number is ");
    String i=sc.next();
    Employee e=new Employee(s,a,sa,y,i);
    System.out.println("Person name is "+e.getname());
    System.out.println("Person age is "+e.getage());
    System.out.println("Person salary is "+e.getsalary());
    System.out.println("Person  join year is "+e.getyear());
    System.out.println("Person insurance number is "+e.getinnum());
  }
}