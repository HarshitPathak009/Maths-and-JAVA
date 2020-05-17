import java.util.*;
class TrapezoidalRule
{
  static double  function(double a)
  {
     return (Math.exp(-Math.pow(a,2)));
  }
  public static void main(String ar[]) 
  {
     Scanner sc = new Scanner(System.in);
    double u,l,h,y=0;
     int n;
    System.out.println("Enter the limits \nEnter Upper Limit  :");
    u = sc.nextDouble();
    System.out.println("Enter Lower Limit :");
    l = sc.nextDouble();
    System.out.println("Enter the nuber of parts the range has to be divided into");
    n = sc.nextInt();
    h = (u-l)/n;
    System.out.println("H  = "+h);
    System.out.println(l+"= "+function(l));
    for(double d = l+h; d<u;d+=h)
    {
      y +=function(d);
      System.out.println(d+" = "+function(d));
    }
    System.out.println(u+"= "+function(u));
    y  = (function(l)+function(u))+2*y;
    y*=(h/2);
    System.out.println("Y = "+y);
  }
}