import java.util.*;
class SmallestMissing2
{
   public static int sMissingEle(int a[],int n)
   {
	int l=0,r=n-1;
	while(l<=r)
	{
	  int m=l+(r-l)/2;
	  if(a[m]==m)
	  l=m+1;
	  else
	  r=m-1;
	}
   return l;

   }
  public static void main(String... args)
   {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
    System.out.println(sMissingEle(a,n));
   }
}