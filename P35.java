import java.util.*;
import java.io.*;
class P35
{
  public static void main(String args[])
  {
    Box b=new Box();
    Scanner sc=new Scanner(System.in);
    double width,height,depth,vol;
    System.out.println("Enter width,height and depth");
    width=sc.nextDouble();
    height=sc.nextDouble();
    depth=sc.nextDouble(); 
    b.intial(width,height,depth);
    vol=b.volume();
    System.out.println("Volume is "+vol);
  }
}
class Box
{
  double width,height,depth;
  public void intial(double width,double height,double depth)
  {
    this.width=width;
    this.height=height;
    this.depth=depth;
  }     
  


  public double volume()
  {     
     double vol=width*height*depth;
     return vol;
   }
 }