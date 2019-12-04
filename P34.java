import java.util.*;
class P34
   {
     public static void main(String args[])
       {
         int i,j,c=0;
         if(args.length!=9)
           System.out.println("Please enter 9 integer numbers");
         else
          {
            int a[][]=new int[3][3];
           
               for(i=0;i<3;i++)
                 {
                  for(j=0;j<3;j++)
                    {

                     a[i][j]=Integer.parseInt(args[c]);
                     c++;
                     }
                 }
             System.out.println("The given array is:");
             int max=a[0][0];
             for(i=0;i<3;i++)
                {
                  for(j=0;j<3;j++)
                   {
                     if(a[i][j]>=max)
                      max=a[i][j];
                    System.out.print(a[i][j]+" ");
                    }
                    System.out.println();
                 }
               System.out.println("The biggest number in the given array is:"+max);
           }
         }
        } 