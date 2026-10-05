import java.util.*;
class NumberOfRotations1
{ 
   public static int rotations(int a[],int n)
   {
     int min=Integer.MAX_VALUE,ans=-1;
     for(int i=0;i<n;i++)
     {
	if(a[i]<min)
	{
	  min=a[i];
	  ans=i;
	}
     }
return ans;

   }
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value:");
 	int n=sc.nextInt();
	int a[]=new int[n];
       for(int i=0;i<n;i++)
	 a[i]=sc.nextInt();
	 System.out.println(rotations(a,n));
    }
}