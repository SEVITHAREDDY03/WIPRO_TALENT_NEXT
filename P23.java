import java.util.*;
   class P23
     {
       public static void main(String args[])
         {
           Scanner sc=new Scanner(System.in);
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            String s=sc.next();
            do
             {
               System.out.println("1.Add");
               System.out.println("2.Subtract");
               int o=sc.nextInt();
              switch(o)
                 {
                   case 1:
                       System.out.println(x1+x2);
                       break;
                   case 2:
                       System.out.println(x1-x2);
                       break;
                   }
                 //String s=sc.next();
                }while(s=="y"||s=="Y");
             }
          }