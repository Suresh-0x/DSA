import java.util.*;
class CountOcuurances2
{
   public static int lastOccurance(int a[],int n,int x)
   {
      int l=0,h=n-1,res=-1;
      while(l<=h)
      {
	int m=l+(h-l)/2;
	if(a[m]==x)
	{
	  res=m;
	  l=m+1;
	}
	else if(a[m]>x)
	{
	  h=m-1;
	}
	else
	l=m+1;
      }
   return res;

  }
public static int firstOccurance(int a[],int n,int x)
   {
      int l=0,h=n-1,res=-1;
      while(l<=h)
      {
	int m=l+(h-l)/2;
	if(a[m]==x)
	{
	  res=m;
	  h=m-1;
	}
	else if(a[m]>x)
	{
	  h=m-1;
	}
	else
	l=m+1;
      }
   return res;

  }

  public static void main(String... args)
   {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
      System.out.println("Enter X value: ");
      int x=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
     int ans=lastOccurance(a,n,x)-firstOccurance(a,n,x);
    System.out.println(ans+1);
   }
}