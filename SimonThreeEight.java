import java.io.*;
class SimonThreeEight
{
  public static void main(String ar[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double ax[], ay[], y=0,h;
    int n;
    System.out.println("Enter the number of terms");
    n = Integer.parseInt(br.readLine());
    ax = new double[n];
    ay  =new double[n];
    System.out.println("Enter values of x");
    for(int i=0;i<n;i++) 
     ax[i] = Double.parseDouble(br.readLine());
    System.out.println("Enter values of y");
    for(int i=0;i<n;i++) 
     ay[i] = Double.parseDouble(br.readLine());    
    y = ay[0]+ay[n-1];
    h = (ax[n-1]-ax[0])/(n-1);
    System.out.println("H = "+h);
    for(int i=1;i<n-1;i++)
    {
       if(i%3==0)
        y+=2*ay[i];
      else
        y+=3*ay[i];
    }
    y=y*(3*h/8);
    System.out.println("Y = "+y);
  }
}