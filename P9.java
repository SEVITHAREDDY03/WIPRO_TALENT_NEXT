class P9
{
 public static void main(String args[])
 {
   String s=args[0];
   int a=Integer.parseInt(args[1]);
 if((s.equals("FEMALE") || s.equals("F")))
 {
   if(a>=1 &&a<=58)
     System.out.println("INTEREST IS 8.2");
   else if(a>=59 && a<=120)
     System.out.println("INTEREST IS 7.6");
    
  }
  else if((s.equals("Male") || s.equals("M")))
  {
    if(a>=1 &&a<=60)
     System.out.println("INTEREST IS 9.2");
   else if(a>=61 && a<=120)
     System.out.println("INTEREST IS 8.3");
  
  } 
  else
    System.out.println("NOT CORRECT");
}
}
