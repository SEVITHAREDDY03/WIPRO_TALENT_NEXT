import java.util.*;
import java.io.*;
class P29
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int temp=0,i,j,n;
    System.out.println("enter no.of elements");
    n=sc.nextInt();
    int a[]=new int[n];
    for(i=0;i<a.length;i++)
    {
       a[i]=sc.nextInt();
    }
    for(i=0;i<n-1;i++)
    {
      for(j=0;j<n-i-1;j++)
       {
          if(a[j]>a[j+1])
          {
             temp=a[j];
             a[j]=a[j+1];
             a[j+1]=temp;
          }
       }
    }
    for(i=0;i<n;i++)
    {
       System.out.print(a[i]+" ");
     }
   }
}