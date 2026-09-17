import java.util.*;
class SquaresOfSortedArr1
{
       static void squareRoot(int a[])
       {
		for(int i=0;i<a.length;i++)
		{
		  a[i]=a[i]*a[i];
		}
 	        Arrays.sort(a);
              for(int ele:a)
            	System.out.print(ele+"   ");
     }
      public static void main(String... args)
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter n value:");
          int n=sc.nextInt();
          int a[]=new int[n];
          for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
          squareRoot(a);
    }
}
       