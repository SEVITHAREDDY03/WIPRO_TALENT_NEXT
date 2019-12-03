class P6

{
  public static void main(String args[])
  {
    int i;
    if(args.length==0)
     System.out.println("NO VALUES");
   else
   {
    for(i=0;i<args.length;i++)
    {
     System.out.print(args[i]);
     if(i!=(args.length-1))
       System.out.print(",");
    }
   }
  }
}
