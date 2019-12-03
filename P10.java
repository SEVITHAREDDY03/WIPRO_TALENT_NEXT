import java.util.*;

class P10
{
 public static void main(String a[])
 {
   Scanner sc=new Scanner(System.in);
   String s=sc.nextLine();
   if(s==s.toLowerCase())
     System.out.println(s+"->"+s.toUpperCase());
   else
     System.out.println(s+"->"+s.toLowerCase());
  }
}