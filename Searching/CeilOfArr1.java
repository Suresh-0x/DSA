import java.util.*;
class CeilOfArr1
{
   public static int ceilValue(int a[],int n,int x)
   {
	if(x<a[0])
	return a[0];                
	if(x>a[n-1])
	return a[n-1];
	int index=-1;
	for(int i=0;i<n-1;i++)
	{
	   if(a[i]<x)
	   {
	     index=i;
	   }
	   else
	   break;
	}
   return a[index+1];
	 
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
    System.out.println(ceilValue(a,n,x));
   }
}