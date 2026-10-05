import java.util.*;
class FloorOfArr
{
   public static int floorOfArray(int a[],int n,int x)
   {
	int ans=-1;
	if(a[0]>x)
	  return -1;
	if(x>a[n-1])
	return a[n-1];
	for(int i=0;i<n-1;i++)
	{
	   if(a[i]>x)
	   {
	     ans=a[i-1];
	     break;
	   }
	}
return ans;
	
   }
   public static void main(String... args)
   {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
      System.out.println("Enter X value: ");
      int x=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
     System.out.println(floorOfArray(a,n,x));
   }
}