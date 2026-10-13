import java.util.*;
class ThreeSum5
{ 
  public static ArrayList<ArrayList<Integer>> threeSum(int a[],int n,int target)
  {
        Arrays.sort(a);
       ArrayList<ArrayList<Integer>> res=new ArrayList<>();	
        for(int i=0;i<n-2;i++)
	{
	   int l=i+1,r=n-1;
	   while(l<r)
	   {
                int sum=a[l]+a[r]+a[i];
		if(sum==target)
		{
                     ArrayList<Integer> ans=new ArrayList<>();
		   ans.add(a[l]);ans.add(a[r]);ans.add(a[i]);
		   res.add(ans);
		    l++;r--;
		}
	        else if(sum>target)
		r--;
	        else
		l++;
	   }
	}
return res;
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