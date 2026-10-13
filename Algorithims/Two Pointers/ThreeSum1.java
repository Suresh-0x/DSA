import java.util.*;
class ThreeSum1
{ 
  public static boolean threeSum(int a[],int n,int target)
  {
        Arrays.sort(a);
        for(int i=0;i<n;i++)
	{
	   int l=i+1,r=n-1;
	   while(l<r)
	   {
		int sum=a[l]+a[r]+a[i];
		if(sum==target)
		return true;
	        else if(sum>target)
		r--;
	        else
		l++;
	   }
	}
return false;
}
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value:");
 	int n=sc.nextInt();
	int a[]=new int[n];
       System.out.println("Enter target Value:");
       int target=sc.nextInt();
	for(int i=0;i<n;i++)
	 a[i]=sc.nextInt();
       System.out.println(threeSum(a,n,target));
   }
}