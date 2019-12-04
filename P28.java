import java.util.*;
import java.io.*;
class P28
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int sum=0,i,n;
    System.out.println("enter no.of elements");
    n=sc.nextInt();
    int a[]=new int[n];
    for(i=0;i<a.length;i++)
    {
       a[i]=sc.nextInt();
    }
    int max=a[0];
    int min=a[0];
    int smax=a[0];
    int smin=a[0];
    for(i=0;i<a.length;i++)
    {
       if(a[i]>max){
          smax=max;
          max=a[i];}
      else if(a[i]>smax)
           smax=a[i];
      else if(a[i]<min){
          smin=min;
          min=a[i];}
      else if(a[i]<smin && a[i]!=min)       
          smin=a[i];   
      else 
         continue; 
    
    System.out.println("FIRST MINIMUM IS "+min+" AND SECOND MINIMUM OF ARRAY IS " +(smin));
    System.out.println("FIRST MAXIMUM IS "+max+" AND SECOND MAXIMUM OF ARRAY IS " +(smax));
  }
}
}