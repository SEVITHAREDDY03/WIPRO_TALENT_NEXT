import java.util.*;
class P33
   {
     public static void main(String args[])
       {
          int i,j,c=0;
         if(args.length!=4)
           System.out.println("Please enter 4 integer numbers");
         else
          {
            int a[][]=new int[2][2];
               for(i=0;i<2;i++)
                 {
                  for(j=0;j<2;j++)
                    {

                     a[i][j]=Integer.parseInt(args[c]);
                     c++;
                     }
                 }
              System.out.println("The given array is :");   
             for(i=0;i<2;i++)
                {
                  for(j=0;j<2;j++)
                   {

                    System.out.print(a[i][j]+" ");
                    }
                    System.out.println();
                 }
              System.out.println("The reverse of the array is :");   
             for(i=1;i>=0;i--)
                {
                  for(j=1;j>=0;j--)
                   {

                    System.out.print(a[i][j]+" ");
                    }
                    System.out.println();
                 }
           }
         }
        } 