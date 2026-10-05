import java.util.*;
class FloorOfArr2
{
   public static int floorValue(int a[],int n,int x)
   {
	int l=0,r=n-1,ans=0;
	if(x<a[0])
	return a[0];
	if(x>a[r])
	return a[r];
	while(l<=r)
	{
	  int m=l+(r-l)/2;
	  if(a[m]<=x)
	  {
	    ans=a[m];
	    l=m+1;
	  }
	  else
	  r=m-1;
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
    System.out.println(floorValue(a,n,x));
   }
}