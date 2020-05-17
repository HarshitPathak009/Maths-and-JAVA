import java.util.*;
class rungeKutta
{
  static double function(double x, double y)
  {
     return (Math.pow(y,2)+Math.pow(x,2));
  }
  public static void main(String ar[])
  {
     Scanner sc = new Scanner(System.in);
     double x,y,h,dy,k1,k2,k3,k4,e;
     System.out.println("Enter value of x0");
     x = sc.nextDouble(); 
     System.out.println("Enter value of y0");
     y = sc.nextDouble();
     System.out.println("Enter value of h");
     h = sc.nextDouble();
     System.out.println("Enter value of Xn");
     e = sc.nextDouble();
     for(double i=x; i<e;i+=h)
     {
      k1 = h*function(x,y);
     System.out.println("for K1 X = "+x + " Y = "+y);
      k2 = h*function(x+h/2,y+k1/2);
     System.out.println("for K2 X = "+(x +h/2)+ " Y = "+(y+k1/2));
      k3 = h*function(x+h/2,y+k2/2);
     System.out.println("for K3 X = "+(x +h/2)+ " Y = "+(y+k2/2));
      k4 = h*function(x+h,y+k3);
     System.out.println("for K3 X = "+(x +h)+ " Y = "+(y+k3));
      dy = (k1+2*k2+2*k3+k4)/6;
      x+=h; 
      y+=dy;
     System.out.println("X = "+x);
     System.out.println("K1 = "+k1);
     System.out.println("K2 = "+k2);
     System.out.println("K3 = "+k3);
     System.out.println("K4 = "+k4);
     System.out.println("Dy = "+dy);
     System.out.println("Y = "+y);
    }
     System.out.println("Ans = "+(y));
  }
}