
import java.util.Scanner;
public class sortingalgos
{	
	static int sorttype_no;
	static String sorttype;
	static int a[];
	static int alength;
	static int no;
	int arr[];


	public static void main(String args[])
	{

		Scanner input=new Scanner(System.in);


		System.out.println("Please enter the number of elements in the array:");
		alength=input.nextInt();

		a=new int[alength];

		System.out.println("Please enter the array to be sorted");
		for(int i=0;i<alength;i++)
			a[i]=input.nextInt();

		System.out.println("Please select the type of sorting");
		no=input.nextInt();

		input.close();
		switch(no)
		{
		case 1:
			sorttype="Selection";
			selection(a);
			break;


		case 2: 
			sorttype="Insertion";
		   insertion(a);
		   break;

		default: sorttype="Invalid";
		break;

		}
	}

	public static void selection (int a[])
	{
		//~N^2/2 compares
		int i,j,miniindex,temp;
		for(i=0;i<a.length;i++)
		{
		   miniindex=i;
			for(j=i+1;j<a.length;j++)
			{
				if(a[j]<a[miniindex])
					miniindex=j;
			}
			
			//n exchanges
			temp=a[miniindex];
			a[miniindex]=a[i];
			a[i]=temp;
		} 
		
		for(i=0;i<alength;i++)
			System.out.println(a[i]);
	}

	
	public static void insertion(int a[])
	{
		 int j;                     // the number of items sorted so far
	     int key;                // the item to be inserted
	     int i;  

	     for (j = 1; j < a.length; j++)    // Start with 1 (not 0)
	    {
	           key = a[ j ];
	           for(i = j - 1; (i >= 0) && (a[ i ] < key); i--)   // Smaller values are moving up
	          {
	                 a[ i+1 ] = a[ i ];
	          }
	         a[ i+1 ] = key;    // Put the key in its proper location
	     }
	for(j=0;j<a.length;j++)
		System.out.println(a[j]);
		
}
}



	