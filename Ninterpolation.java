import java.util.*;
class NInterpolation
{
  public static void main(String ar[])
  {
     Scanner sc = new Scanner(System.in);
     int n,k; 
     double  u, h ,x,a,y;
     System.out.println("Enter number of x givens");
     n = sc.nextInt();
     double ax[] = new double[n]; 
     double ay[] = new double[n];
     double dely[] = new double[n-1];
     System.out.println("Enter all the values of x");
     for(int i=0;i<n;i++)
     {
          System.out.print("X"+(i+1)+" = ");
          ax[i] = sc.nextDouble(); 
      }
     System.out.println("Enter all the values of y");
     for(int i=0;i<n;i++)
     {
          System.out.print("Y"+(i+1)+" = ");
          ay[i] = sc.nextDouble(); 
     }
     h = ax[1]-ax[0];
     System.out.println("Enter the value of x for which y has to be found");
     x = sc.nextDouble();
     k = findA(x,ax);
     a = ax[k];
     u = (x-a)/h;
     y=ay[k];
     for(int i=1;i<n;i++)
     {
       double l=1,f=1;
       for(int j=0;j<i;j++)
       {
              l=l *(u-j);
             f=f*(j+1); 
       }
       l = l/f;  
       y+=l*;
     }
    System.out.println("Y = "+y);
  }
  public static int findA(double n, double ax[])
  {
    if(n>ax[ax.length-1])
    {   
        return ax.length-1;
    }
    for(int i=ax.length-1;i>=0;i--)
    {
       if(n>ax[i])
          return i;
    }
    return 0;
  } 
}