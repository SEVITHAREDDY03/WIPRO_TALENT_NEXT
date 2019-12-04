import java.util.*;
class P18
   {
       public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter Number");
          int num=sc.nextInt();
          int temp=num;
          int div,sum=0;
          while(num>0)
            {
             div=num%10;
             sum=sum+div;
             num=num/10;
            }
            System.out.println(temp+"->"+sum);
        }
   }

  
