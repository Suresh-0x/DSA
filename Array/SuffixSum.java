import java.util.*;
class SuffixSum
{ 
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value: ");
      int n=sc.nextInt();
      int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
	 a[i]=sc.nextInt();
	}
      int sum=a[n-1];
      for(int i=n-2;i>=0;i--)
      {
        sum=sum+a[i];
        a[i]=sum;
      }
      System.out.println("output Array is:");
      for(int x:a)
      System.out.print(x+"  ");
      
  }
}
