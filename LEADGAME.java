import java.io.*;
import java.math.*;
import java.util.*;
class LEADGAME
{
  public static void main(String[]args)
  {
    Scanner venki=new Scanner(System.in);
    int n=venki.nextInt();
    int max=-1;
    int w=0,x=-1;
    for(int N=0;N<n;N++)
    {
      int flag=0;
      int s=venki.nextInt();
      int t=venki.nextInt();
      if(s>t)
      {
        x=s-t;
        flag=1;
      }
      if(t>s)
      {
        x=t-s;
        flag=2;
      }
      if(x>max)
      {
        max=x;
        if(flag==1)
          w=1;
        if(flag==2)
          w=2;
      }
    }
    System.out.println(w+" "+max);
  }
}
