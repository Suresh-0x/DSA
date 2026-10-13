import java.util.*;
class ThreeSum3
{ 
  public static boolean threeSum(int a[],int n,int target)
  {
      	for(int i=0;i<n;i++)
	{
	  HashMap<Integer,Integer> map=new HashMap<>();
	  for(int j=i+1;j<n;j++)
	  {
	   int ele=target-a[i]-a[j];
	   if(map.containsKey(ele))
	   return true;
         map.put(a[j],map.getOrDefault(a[j],0)+1);
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