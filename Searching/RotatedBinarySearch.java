import java.util.*;
class RotatedBinarySearch
{ 
   public static int binarySearch(int a[],int n,int x)
   {
      int l=0,r=n-1;
      while(l<r)
      {
	int m=l+(r-l)/2;
        if(a[m]==x)
	return m;
	else if(a[l]<=a[m])
	{
	  if(x>=a[l]&&x<=a[m])
	   r=m-1;
	  else
	   l=m+1;
        }
	else
	{
	   if(x<=a[r]&&x>=a[m])
	   l=m+1;
	   else
	   r=m-1;
	}
    }
return -1;

   }
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value:");
 	int n=sc.nextInt();
	int a[]=new int[n];
       for(int i=0;i<n;i++)
	 a[i]=sc.nextInt();
       System.out.println("Enter x value:");
 	int x=sc.nextInt();
	 System.out.print(binarySearch(a,n,x));
    }
}