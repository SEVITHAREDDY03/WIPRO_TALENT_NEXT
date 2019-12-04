import java.util.Arrays;
import java.util.*;
class P30
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int i,j,n,l;
    System.out.println("enter no.of elements");
    n=sc.nextInt();
    int a[]=new int[n];
    for(i=0;i<a.length;i++)
    {
       a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    n=removing(a,n);
    for(i=0;i<n;i++)
     System.out.print(a[i]+" ");
   }
   public static int removing(int a[],int n){
   if(n==0 || n==1)
          return n;
   int t[]=new int[n];
    int i,j=0;
    for(i=0;i<n-1;i++){
       if(a[i]!=a[i+1]){
           t[j++]=a[i];
      }
     }
     t[j++]=a[n-1];
     for(i=0;i<j;i++){
            a[i]=t[i];
    }
    return j;
 }
    
}