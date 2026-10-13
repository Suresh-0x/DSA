import java.util.*;
class ThreeSum2
{ 
  public static boolean threeSum(int a[],int n,int target)
  {
      	for(int i=0;i<n;i++)
	{
	  HashSet<Integer> set=new HashSet<>();
	  for(int j=i+1;j<n;j++)
	  {
	   int ele=target-a[i]-a[j];
	   if(set.contains(ele))
	   return true;
         set.add(a[j]);
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