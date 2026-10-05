import java.util.*;
class PivotInRotatedArr1
{ 
   public static int pivot(int a[],int n)
   {
     int min=Integer.MAX_VALUE;
     for(int i=0;i<n;i++)
     {
	if(a[i]<min)
	{
	  min=a[i];
	}
     }
return min;

   }
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value:");
 	int n=sc.nextInt();
	int a[]=new int[n];
       for(int i=0;i<n;i++)
	 a[i]=sc.nextInt();
	 System.out.print("Pivot Element is:"+pivot(a,n));
    }
}