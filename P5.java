import java.util.*;
class P5
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("ENTER THE NUMBER");
   int a=sc.nextInt();
   if(a==0)
     System.out.println("NUMBER IS NEITHER EVEN NOR ODD");
   else if(a%2==0)
      System.out.println("NUMBER IS EVEN");
   else
       System.out.println("NUMBER IS ODD");
 }
}
