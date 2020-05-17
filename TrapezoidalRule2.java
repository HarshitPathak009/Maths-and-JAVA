import java.util.*;
class TrapezoidalRule2
{
  public static void main(String ar[]) 
  {
     Scanner sc = new Scanner(System.in);
    double ax[],ay[],h,y=0;
     int n;
    System.out.println("Enter the nuber of elements");
    n = sc.nextInt();
    ax  = new double[n];
    ay  = new double[n];
    System.out.println("Enter values of x");
    for(int i=0;i<n;i++) 
       ax[i] = sc.nextDouble();
    System.out.println("Enter values of y");
    for(int i=0;i<n;i++) 
       ay[i] = sc.nextDouble();
    h = (ax[ax.length-1]-ax[0])/(ax.length-1);
    System.out.println("H  = "+h);
    for(int d = 1; d<ay.length-1;d++)
    {
      y +=ay[d];
    }
    y  = (ay[0]+ay[ay.length-1])+2*y;
    y*=(h/2);
    System.out.println("Y = "+y);
  }
}