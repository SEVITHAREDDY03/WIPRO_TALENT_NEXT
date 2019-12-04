import java.util.*;
class P21
   {
       public static void main(String args[])
        {
          
          int num=Integer.parseInt(args[0]);
          int temp=num;
          int div,sum=0;
          while(num>0)
            {
             div=num%10;
             sum=sum*10+div;
             num=num/10;
            }
         if(temp==sum)
           System.out.println(temp+" is a palindrome");
          else
            System.out.println(temp+" is not a palindrome"); 
          
      
        }
   }
             
