import java.util.*;
class NumberOfRotations
{ 
   public static int rotations(int a[],int n)
   {
      int l=0,r=n-1;
      while(l<r)
      {
	int m=(l+r)/2;
	if(a[m]>a[r])
	{
	   l=m+1;
	}
	else
	{
	  r=m;
	}
     }
return l;
   }
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value:");
 	int n=sc.nextInt();
	int a[]=new int[n];
       for(int i=0;i<n;i++)
	 a[i]=sc.nextInt();
	 System.out.print(rotations(a,n));
    }
}