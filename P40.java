import java.util.*;
class Person
{ 
  String name;
  int age;
  Person(String name,int age)
  {
    this.name=name;
    this.age=age;
  }
  String getname()
  {
    return name;
  }
  int getage()
  {
    return age;
  }

}
class Employee extends Person
{
  double salary; 
  String in_num;
  int year;
  Employee(String name,int age,double salary,int year,String in_num)
  {
    super(name,age);
    this.salary=salary;
    this.year=year;
    this.in_num=in_num;
  }
  String getinnum()
  {
    return in_num;
  }
  int getyear()
  {
    return year;
  }
  double getsalary()
  {
    return salary;
  }


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
