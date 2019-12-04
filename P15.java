import java.util.*;
import java.lang.*;
class P15
   {
      public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter number");
           int n=sc.nextInt();
           if(n<=1)
           System.out.println("Not Prime");
           else
             {
                int i,c=0;
              if(n==2)
               {
                System.out.println("Prime");
               }               
              else
                {
                 for(i=2;i<=Math.sqrt(n);i++)
                   {
                     if(n%i==0)
                       {
                         System.out.println("Not Prime");
                         c=1;
                         break;
                        }
                     }
                    if(c==0)
                      System.out.println("Prime");
                   }
                  }
               }
           }
