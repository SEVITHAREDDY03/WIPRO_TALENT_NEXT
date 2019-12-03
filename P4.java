import java.util.*;
class P4
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("ENTER THE NUMBER");
   int a=sc.nextInt();
   if(a==0)
     System.out.println("NUMBER IS ZERO");
   else if(a<0)
      System.out.println("NUMBER IS NEGATIVE");
   else
       System.out.println("NUMBER IS POSITIVE");
 }
}
