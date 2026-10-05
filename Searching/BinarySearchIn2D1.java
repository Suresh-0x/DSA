import java.util.*;
class BinarySearchIn2D1
{ 
   
    public static boolean isCheck(int a[][],int l,int m,int x)
    {
	for(int j=0;j<m;j++)
	{
	  if(a[l][j]==x)
	  return true;
	}
	return false;
   }
   public static boolean binarySearch(int a[][],int n,int m,int x)
   {
	for(int i=0;i<n;i++)
	{
	   boolean b=isCheck(a,i,m,x);
	   if(b)
	   return true;
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