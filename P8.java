import java.util.*;
class P8
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    char a=sc.next().charAt(0);
    if(a>='0' && a<='9')
       System.out.println("Digit");
     else if((a>='a' && a<='z') || (a>='A' && a<='Z'))
        System.out.println("Alphabet");
    else
        System.out.println("Special Character");
   }
}