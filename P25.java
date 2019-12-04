import java.util.*;
class P25
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
    int max=0;
    int min=0;
    for(i=0;i<a.length;i++)
    {
      if(i==0)
       {
          min=a[i];
          max=a[i];
       } 
      else if(a[i]>max)
          max=a[i];
      else if(a[i]<min)
         min=a[i];
      else 
         continue; 
    }
    System.out.println("MINIMUM OF ARRAY IS " +min);
    System.out.println("MAXIMUM OF ARRAY IS " +max);
  }
}