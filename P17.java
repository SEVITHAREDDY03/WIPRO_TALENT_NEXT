import java.util.*;
import java.lang.*;
class P17
   {
      public static void main(String args[])
        {
           if(args.length==0)
              System.out.println("Please enter an integer number");
           else{
           int n=Integer.parseInt(args[0]);
           int c,i;
           if(n<=1)
           System.out.println("Neither prime nor composite");
           else
             {
                c=0;

              if(n==2)
               {
                System.out.println(n+" is a prime number");
               }               
              else
                {
                 for(i=2;i<=Math.sqrt(n);i++)
                   {
                     if(n%i==0)
                       {
                         System.out.println(n+" is not a prime number");
                         c=1;
                         break;
                        }
                     }
                    if(c==0)
                      System.out.println(n+" is a prime number");
                   }
                  }
               }
           }
         }
