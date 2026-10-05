import java.util.*;
class FindNoOf1s4
{
   public static int countOnes(int a[],int n)
   {
     int l=0,r=n-1,res=0;
     while(l<=r)
     {
	int m=l+(r-l)/2;
	if(a[m]==1)
	{
	  res=m;
	  l=m+1;
	}
	else
	r=m-1;
     }
     return res>0?res+1:0;     	
   }
  public static void main(String... args)
   {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
      int a[]=new int[n];
     for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
    System.out.println(countOnes(a,n));
   }
}