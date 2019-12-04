import java.util.*;
class P27
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int k,n,i,flag=0;
    System.out.println("enter no.of elements");
    n=sc.nextInt();
    int a[]=new int[n];
    for(i=0;i<a.length;i++)
    {
       a[i]=sc.nextInt();
    }
    for(i=0;i<a.length;i++)
    {
       System.out.print(Character.toString(a[i])+" ");
    }
   }
 }