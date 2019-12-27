import java.io.*;
import java.util.*;
class ArrayClass
{
	/*function to insert a Number 	
	*function to remove a number from a particular index
	*function return index of a particular number
	*/
	static int n,a[]=new int[10],flag=0;
	void insert(int x)
	{
		int i;
		if(n==a.length)
		{
			int A[]=new int[n*2];
			for(i=0;i<n;i++)
				A[i]=a[i];
			a=A;
		}
		a[n]=x;
		n++;
	}

	void delete(int x)
	{
		int i,j;
		for(i=0;i<n-1;i++)
		{
			if(a[i]==x)
			{
				flag=1;
			}
			if(flag==1)
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		n--;
	}

	int indexOf(int x)
	{
		int i,j;
		for(i=0;i<n;i++)
		{
			if(a[i]==x)
			{
				flag=1;
				return(i);
			}
		}
		return(-1);
	}

	void deleteAt(int x)
	{
		for(int i=x;i<n-1;i++)
		{
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		n--;
	}

	int[] intersect()throws IOException
	{
		int b[]=new int[1000],c[]=new int[1000];
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter the array size of new array :");
		int m=Integer.parseInt(venki.readLine());
		System.out.println("\nEnter the array elements :");
		int i,j,k=0;
		for(i=0;i<m;i++)
		{
			b[i]=Integer.parseInt(venki.readLine());
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				if(a[i]==b[j])
				{
					c[k]=a[i];
					k++;
					break;
				}
			}
		}
		
		System.out.println("\nCommon elements!");
		for(i=0;i<k;i++)
			System.out.print(c[i]+" ");
		return c;
	}

	public static void main(String[]args)throws IOException
	{
		BufferedReader venki=new BufferedReader(new InputStreamReader(System.in));
		ArrayClass ob=new ArrayClass();
		System.out.println("\nEnter the array size : ");
		n=Integer.parseInt(venki.readLine());
		System.out.println("\nEnter array elements : ");
		int i;
		for(i=0;i<n;i++)
			a[i]=Integer.parseInt(venki.readLine());
		do
		{
			System.out.println("\nEnter the operation to be performed : \n1.Insert\t3.Index of element \n2.Delete Element\t4.Delete at Index\n5.Intersection");
			switch(Integer.parseInt(venki.readLine()))
			{
				case 1:	System.out.println("\nEnter the element to be inserted : ");
					   	ob.insert(Integer.parseInt(venki.readLine()));
					   	System.out.println("\nInserted Succesfully!");
				break;

				case 2:	flag=0;
						System.out.println("\nEnter the element to be deleted  : ");
					   	ob.delete(Integer.parseInt(venki.readLine()));
					   	if(flag!=0)
					   		System.out.println("\nDeleted Succesfully!");
					   	else
					   		System.out.println("\nElement not found in the array...");
				break;

				case 3:	flag=0;
						System.out.println("\nEnterr the element who's index has to be found : ");
						int index=ob.indexOf(Integer.parseInt(venki.readLine()));
						System.out.println("\nINDEX : "+index);
				break;
				case 4:	flag=0;
						System.out.println("\nEnter the the index where the element has to be deleted:");
						ob.deleteAt(Integer.parseInt(venki.readLine()));
				case 5:	int c[]=new int[1000];
						c=ob.intersect();
						
				break;
				default: System.out.println("\nWRONG INPUT!");
			}
			System.out.println("\nModified array : ");
			for(i=0;i<n;i++)
				   		System.out.print(a[i]+"  ");
			System.out.println("\nPress 1 to continue performing operations\nPress 0 to EXIT!");
		}while(Integer.parseInt(venki.readLine())!=0);
	}
}