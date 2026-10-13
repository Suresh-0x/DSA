import java.util.*;
class LargestInTwoArr
{ 
   public static int largestEle(int a[],int n,int b[],int m)
   {
       Arrays.sort(a);
       Arrays.sort(b);
       int l=n-1,r=m-1;
	while(l>=0&&r>=0)
	{
	  if(a[l]==b[r])
	  return a[l];
	  else if(a[l]>b[r])
	  l--;
	  else
	   r--;
        }

       return -1;
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
      
        System.out.print("Largest common Element is :"+largestEle(a,n,b,m));
    }
}