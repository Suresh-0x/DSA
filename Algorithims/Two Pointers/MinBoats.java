import java.util.*;
class MinBoats
{ 
   public static int minBoats(int a[],int n,int limit)
  {
       int l=0,r=n-1,count=0;
       Arrays.sort(a);
      	while(l<=r)
	{
	  if(a[l]+a[r]<=limit)
	  {
	    count++;
	    l++;
	    r--;
	  }
	else
	{
	 count++;
	 r--;
	}
       }
return count;
}
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value:");
 	int n=sc.nextInt();
	int a[]=new int[n];
       System.out.println("Enter limit Value:");
       int limit=sc.nextInt();
	for(int i=0;i<n;i++)
	 a[i]=sc.nextInt();
       System.out.println("Minimum Boats Requried: "+minBoats(a,n,limit));
   }
}