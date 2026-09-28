import java.util.*;
class LinearSearch1
{

  static boolean linearSearch(int a[],int x,int n)
  {
      if(n>a.length-1)
      return false;
      else if(a[n]==x)
      return true;
      else
	return linearSearch(a,x,n+1);
  }
   public static void main(String... args)
   {
         
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value:");
      int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	 a[i]=sc.nextInt();
   System.out.println("Enter seraching element:");
   int x=sc.nextInt();
   System.out.println("First Index: "+linearSearch(a,x,0));
      }
}
