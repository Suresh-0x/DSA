import java.util.*;
class TwoSumInTwoArr2
{ 
   public static int twoSum(int a[],int n,int b[],int m,int x)
   {
      	HashMap<Integer,Integer> map=new HashMap<>();
	int count=0;
	for(int x1:a)
	 map.put(x1,map.getOrDefault(x1,0)+1);
	for(int i=0;i<m;i++)
	{
	  int ele=x-b[i];
	  if(map.containsKey(ele))
	   count+=map.get(ele);
	 }
return count;
   }
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n&m values:");
 	int n=sc.nextInt();
        int m=sc.nextInt();
	int a[]=new int[n];
        int b[]=new int[m];
       for(int i=0;i<n;i++)
	 a[i]=sc.nextInt();
        for(int i=0;i<m;i++)
	 b[i]=sc.nextInt();
      System.out.println("Enter X value: ");
	int x=sc.nextInt();
        System.out.print("No of pairs is:"+twoSum(a,n,b,m,x));
    }
}