class Patient
 {
    String name;
    double weight,height;
    public void details(String name,double weight,double height)
    {
     System.out.println("NAME of patient is "+name);
     System.out.println("WEIGHT of patient is "+weight);
     System.out.println("HEIGHT of patient is "+height);
     } 
    public static double BMI(double weight,double height)
    {
       double bmi=(weight/(height*height))*703;
       return bmi;
    }

  }
class P37
{
   public static void main(String args[])
   {
     Patient p=new Patient();
     double res=p.BMI(55,5.2);
     p.details("Surya",55,5.2);
     System.out.println("BMI of patient is "+res);
   }
}

     
