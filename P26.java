import java.util.*;
class P26
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int k,i,n,flag=0;
    System.out.println("enter no.of elements");
    n=sc.nextInt();
    int a[]=new int[n];
    for(i=0;i<a.length;i++)
    {
       a[i]=sc.nextInt();
    }
    System.out.println("enter number");
    k=sc.nextInt();
    for(i=0;i<a.length;i++)
     {
        if(a[i]==k){
           System.out.println(i+1);
            flag=1;
            break;}
     }
    if(flag==0)
       System.out.println("-1");
  }
}