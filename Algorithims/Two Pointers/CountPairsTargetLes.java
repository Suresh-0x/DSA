import java.util.*;
class CountPairsTargetLes
{ 
   public static int countPairs(int a[],int n,int target)
   {
         int l=0,r=n-1,count=0;
	 while(l<r)
	 {
	   if(a[r]+a[l]<target)
           {
	      count+=(r-l);
	      l++;
	   }
           else
	     r--;
         }
  return count;
   }
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value:");
 	int n=sc.nextInt();
	int a[]=new int[n];
      for(int i=0;i<n;i++)
	 a[i]=sc.nextInt();
      System.out.println("Enter target Value :");
      int target=sc.nextInt();
        System.out.println(countPairs(a,n,target));
   }
}