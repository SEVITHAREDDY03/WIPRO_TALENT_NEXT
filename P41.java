import java.util.*;
class Person
{ 
  String name;
  int age;
  String gender;
  Person(String name,int age,String gender)
  {
    this.name=name;
    this.age=age;
    this.gender=gender;
  }
}
class Student extends Person
{
  String college;
  Student(String name,int age,String gender,String college)
  {
   super(name,age,gender);
   this.college=college;
  }
}
class Teacher extends Person
{
  double salary;
  String sub;
  Teacher(String name,int age,String gender,double salary,String sub)
  {
    super(name,age,gender);
    this.salary=salary;
    this.sub=sub;
  }
}
class CollegeStudent extends Student
{
   int year; 
   String branch;
   CollegeStudent(String name,int age,String gender,String college,int year,String branch)
   {
     super(name,age,gender,college);
     this.year=year;
     this.branch=branch;
    }
}
class P41
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter name");
    String n=sc.next();
    System.out.println("Enter age");
    int a=sc.nextInt();
    System.out.println("Enter gender");
    String g=sc.next();
    System.out.println("1.Teacher 2.Student");
    System.out.println("Enter option");
    int op=sc.nextInt();
    switch(op)
    {
      case 1:System.out.println("Enter subject");
             String s=sc.next();
             System.out.println("Enter salary");
             double sa=sc.nextDouble();
             Teacher t=new Teacher(n,a,g,sa,s);
             System.out.println("Teacher name is "+t.name);
             System.out.println("Teacher age  is  "+t.age);
             System.out.println("Teacher gender is "+t.gender);
             System.out.println("Teacher salary  is  "+t.salary);
             System.out.println("Teacher subject is "+t.sub);
             break;
      case 2:System.out.println("Enter college");
             String coll=sc.next();
             System.out.println("Enter current year");
             int ye=sc.nextInt();
             System.out.println("Enter branch");
             String bra=sc.next();
             CollegeStudent cs=new CollegeStudent(n,a,g,coll,ye,bra);
             System.out.println("Student name is "+cs.name);
             System.out.println("Student age  is  "+cs.age);
             System.out.println("Student gender is "+cs.gender);
             System.out.println("Student college  is  "+cs.college);
             System.out.println("Student current year is "+cs.year);
             System.out.println("Student branch is  "+cs.branch);
             break;
    default:break;
    }
  }
}
