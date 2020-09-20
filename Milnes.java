import java.util.*;
class Milnes //this is in the small branch
{
  static Scanner sc = new Scanner(System.in);
  static ArrayList<Double> input(ArrayList<Double> arr, int n)
  {
     for(int i=0;i<n;i++)
     {
       System.out.println("Enter the values " + (i+1));
       arr.add(sc.nextDouble());
     }
    return arr;
  }
  static void view(ArrayList<Double> x,ArrayList<Double> y,ArrayList<Double> dy)
  {
   for(int i=0; i<x.size();i++)
      System.out.println(i+"\t"+x.get(i)+"\t"+y.get(i)+"\t"+dy.get(i));
  }
  static double function(double x, double y)
  {
     return (1+x*y*y);
  }
  public static void main(String ar[])
  {
    int n;
    System.out.println("Enter the  numbr of elements");
    n = sc.nextInt();
   ArrayList<Double> x = new ArrayList<Double>();
   ArrayList<Double> y = new ArrayList<Double>();
   ArrayList<Double> dy = new ArrayList<Double>();
    double h, yn, xn;
    System.out.println("Enter the values of X");
    x = input(x,n);
    h =x.get(1)-x.get(0);
   System.out.println("Enter the values of Y");
   y = input(y,n);    
    System.out.println("Enter value of xn for which yn has to be calculated");
    xn = sc.nextDouble();
    System.out.println("H = "+h);
    for(int i=0;i<n;i++)
          dy.add(function(x.get(i),y.get(i)));
    for(double i=x.get(n-1); i<xn;i+=h)
   {
   System.out.println("The values are:-\nI\tX\tY\tY\'");
   view(x,y,dy);
   yn = y.get(n-4)+((4*h/3.0)*(2*dy.get(n-3)-dy.get(n-2)+2*dy.get(n-1)));
   System.out.println("Yn  = "+yn);
   yn = y.get(n-2)+((h/3)*(dy.get(n-2)+4*dy.get(n-1)+function(i+h,yn)));
   x.add(i+h);
   y.add(yn);
   dy.add(function(xn,yn));
   System.out.println("Corrected Yn  = "+yn); 
   n++;
   }
  }
}
