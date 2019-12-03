import java.util.*;
class P7
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("ENTER THE CHARACTER");
   char a=sc.next().charAt(0);
   char b=sc.next().charAt(0);
   if(Character.compare(a,b)>0)
     System.out.println(b+","+a);
   else
     System.out.println(a+","+b);
}
}

