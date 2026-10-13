import java.util.*;
class TwoSumInTwoArr
{ 
   public static int twoSum(int a[],int n,int b[],int m,int x)
   {
      int l=0,r=m-1,count=0;
      while(l<n&&r>=0)
      {
	 if(a[l]+b[r]==x)
	{
	 count++;
	l++;
        r--;
	}
	else if(a[l]+b[r]>x)
	r--;
	else
	l++;
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