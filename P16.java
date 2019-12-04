import java.util.*;
class P16
   {
         public static void main(String args[])
        {
                int j,c,i; 
                for(i=11;i<99;i++)
                  {
                      c=0;
                 for(j=2;j<=Math.sqrt(i);j++)
                   {
                     if(i%j==0)
                       {
                         c=1;
                         break;
                        }
                     }
                    if(c==0)
                      System.out.println(i);
                   }
                  }
               }
           
