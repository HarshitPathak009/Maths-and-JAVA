import java.io.*;
class Linterpolation
{
 public static void main(String ar[])throws IOException
 {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   double x,y=0;
   int n;
   double a1,a2;
   System.out.println("Enter number of elements");
   n = Integer.parseInt(br.readLine());
   double ex[] = new double[n];
   double ey[] = new double[n];
   System.out.println("Enter elements in x:-");
   for(int i=0;i<n;i++)
   {
      System.out.println("Enter element x"+i);
      ex[i] = Double.parseDouble(br.readLine());
   }
   for(int i=0;i<n;i++)
   {
      System.out.println("Enter element y"+i);
      ey[i] = Double.parseDouble(br.readLine());
   }
   System.out.println("Enter value of x to be looked");
   x = Double.parseDouble(br.readLine());
   for(int i=0;i<n;i++)
   {
     a1=1;
     a2=1;
     for(int j=0;j<n;j++)
     {
       if(i!=j)
       {
           a1=a1*(x-ex[j]);
           a2=a2*(ex[i]-ex[j]);
       }
     }
     y+=(a1/a2)*ey[i];
   }
  System.out.println("For x = "+x+"\t y = "+y);
 }
}