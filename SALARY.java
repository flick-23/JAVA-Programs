import java.io.*;
import java.util.*;
class SALARY
{
    public static void main(String[]args)throws IOException
    {
        Scanner venki=new Scanner(System.in);
        int T=venki.nextInt();
        for(int t=0;t<T;t++)
        {
            int n=venki.nextInt();
            int a[]=new int[n];
            int i,j=0;
            for(i=0;i<n;i++)
                a[i]=venki.nextInt();
            int max=-1,pos=0;
            
            int flag=1;
            int c=0,k=0;
            while(c!=n)
            {
                c=0;
                if(n==1)
                {
                    c=1;
                }
                else
                {
                    max=-1;
                    for(i=0;i<n-1;i++)
                    {
                        if(a[i]==a[i+1])
                             c++;
                        if(a[i]>max)
                        {
                             max=a[i];
                            pos=i;
                        }
                    }
                    if(a[n-1]==a[n-2])
                        c++;
                }
                if (c==n)
                {
                    break;
                }
                else
                {
                    k++;
                    for(i=0;i<n;i++)
                    {
                        if(i!=pos)
                            a[i]++;
                    }
                }
            }
            System.out.println(k);
        }
    }
}