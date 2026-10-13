import java.util.*;
class TwoSumClosest
{ 
   public static int[] twoSumClosest(int a[],int n,int x)
   {
      Arrays.sort(a);
      int l=0,r=n-1,ele1=0,ele2=0,diff=Integer.MAX_VALUE;
	while(l<r)
	{
	  int sum=a[l]+a[r];
	  int value=Math.abs(x-sum);
          if(value==0)
	  return new int[]{a[l],a[r]};
	  if(value<diff)
	  {
	      diff=value;
	      ele1=a[l];
	      ele2=a[r];
	  }
   	  if(a[l]+a[r]<x)
	  {
	    l++;
	  }
	  else
	  {
	     r--;
	  }
        } 
     return new int[]{ele1,ele2};
   }
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value:");
 	int n=sc.nextInt(); 
	int a[]=new int[n];
       for(int i=0;i<n;i++)
	 a[i]=sc.nextInt(); 
      System.out.println("Enter X value: ");
	int x=sc.nextInt();
        int b[]=twoSumClosest(a,n,x);
	System.out.println("["+b[0]+","+b[1]+"]");
    }
}