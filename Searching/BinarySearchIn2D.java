import java.util.*;
class BinarySearchIn2D
{ 
   
   public static boolean binarySearch(int a[][],int n,int m,int x)
   {
	int i=0,j=m-1;
	while(i<n&&j>=0)
	{
	   if(a[i][j]==x)
	    return true;
	   else if(a[i][j]<x)
	   i++;
	  else 
	  j--;
	}
   return false;     
   }
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n&m value:");
 	int n=sc.nextInt();
	int m=sc.nextInt();
	int a[][]=new int[n][m];
       for(int i=0;i<n;i++)
       {
	 for(int j=0;j<m;j++)
	{
	 a[i][j]=sc.nextInt();
	}
       }
       System.out.println("Enter x value:");
 	int x=sc.nextInt();
	 System.out.print(binarySearch(a,n,m,x));
    }
}