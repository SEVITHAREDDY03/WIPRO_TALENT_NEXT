import java.util.*;
class P22
   {
    public static void main(String args[])
      { 
         int count=5,i=2;
         for(count=0;count<5;)
           {
            if(i%2==0 && i%3==0 && i%5==0)
            {
              System.out.println(i);
              count++;
             }
            i++;
            }
          
      }
  }
