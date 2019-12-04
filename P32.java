import java.util.*;
class P32
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int i,j,n;
    System.out.println("enter no.of elements");
    n=sc.nextInt();
    int a[]=new int[n];
    for(i=0;i<a.length;i++)
    {
       a[i]=sc.nextInt();
    }
        int sum=0,c=-1,p=-1;
     for(i=0;i<n;i++)
     {
       for(j=i+1;j<n;j++)
         {
           if(a[i]==6)
            { 
              if(a[j]==7)
               {
                 c=i;
                 p=j;
                 break;
               }
             }
       } 
     }
        if(c!=-1&&p!=-1)
        {
       for(int x=c;x<=p;x++)
          {
            a[x]=0;
           }
          }
         for(i=0;i<n;i++)
            sum=sum+a[i];
        System.out.println(sum);
      }
   }  
             