import java.util.*;
class Simpsons
{
  static double onethird(int n, double ax[],double ay[])
  {
    double y = ay[0]+ay[n-1];
    double h = (ax[n-1]-ax[0])/(n-1);
    System.out.println("H = "+h);
    for(int i=1;i<n-1;i++)
    {
       if(i%2==0)
        y+=2*ay[i];
      else
        y+=4*ay[i];
    }
    y=y*(h/3);
    return y;
  }
  static double threeeight(int n, double ax[],double ay[])
  {
    double y = ay[0]+ay[n-1];
    double h = (ax[n-1]-ax[0])/(n-1);
    System.out.println("H = "+h);
    for(int i=1;i<n-1;i++)
    {
       if(i%3==0)
        y+=2*ay[i];
      else
        y+=3*ay[i];
    }
    y=y*(3*h/8); 
    return y;
  }
  public static void main(String ar[])
  {
    Scanner sc = new Scanner(System.in);
    double ax[] , ay[],y=0;
    int n;
    System.out.println("Enter numer of terms");
    n = sc.nextInt();
    if((n-1)%3!=0 && (n-1)%2!=0)
    {
       System.out.println("Simpson not available");
       System.exit(0);
     }
    ax = new double[n];
    ay = new double[n];
    System.out.println("Enter values of x");
    for(int i=0;i<n;i++) 
     ax[i] = sc.nextDouble();
    System.out.println("Enter values of y");
    for(int i=0;i<n;i++) 
     ay[i] = sc.nextDouble(); 
    if ((n-1)%2==0) 
    {
       System.out.println("One-Third");
       y = onethird(n,ax,ay);
    }
   else if((n-1)%3==0)
   {
      System.out.println("Three-Eight");
      y = threeeight(n,ax,ay);
   }
   System.out.println("Y= "+y);
  }
}