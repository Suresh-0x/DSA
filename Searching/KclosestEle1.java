import java.util.*;
class KclosestEle1
{
   public static ArrayList<Integer> closestElements(int a[],int n,int k,int x )
   {
	int l=0,r=n-1;
	while((r-l+1)>k)
	{
	  int value1=Math.abs(a[l]-x);
	  int value2=Math.abs(a[r]-x);
	  if(value1>value2)
	    l++;
	  else
	   r--;
	 }
	 ArrayList<Integer> ans=new ArrayList<>();
	 for(int i=l;i<=r;i++)
	  ans.add(a[i]);
	return ans;
   }
  public static void main(String... args)
   {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
     System.out.println("Enter K value: ");
     int k=sc.nextInt();
      System.out.println("Enter x value: ");
     int x=sc.nextInt();
    System.out.println(closestElements(a,n,k,x));
   }
}