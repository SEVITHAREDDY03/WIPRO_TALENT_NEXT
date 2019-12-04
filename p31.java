import java.util.Arrays;
import java.util.*;
class P31
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int i,j,n,c;
    System.out.println("enter no.of elements");
    n=sc.nextInt();
    int a[]=new int[n];
    for(i=0;i<a.length;i++)
    {
       a[i]=sc.nextInt();
    }
    c=freq(a,n);
    System.out.println("Most frequency is "+c);
  }
  public static int freq(int a[],int n)
  {
       Arrays.sort(a);
    int max=1,q=1,res=a[0],i;
   
    for(i=1;i<n;i++)
    {
      if(a[i]==a[i-1])
           q=q+1;
       else{
         if(q>max){
             max=q;
             res=a[i-1];
           }
          q=1;
      }
   }
    if(q>max)
    {
       max=q;
        res=a[n-1];
      }
  return res;
 }
}