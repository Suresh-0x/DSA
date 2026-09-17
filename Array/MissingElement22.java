import java.util.*;
class MissingElement22
{
      public static void main(String... args)
      {
 	Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:\t");
        int n=sc.nextInt();
  	int sum=0;
        int arr[]=new int[n];
        for(int i=0;i<n-1;i++)
        {
          arr[i]=sc.nextInt();
        }
        for(int i=1;i<=n;i++)
        {
           sum=sum^i;
        }
	for(int i=0;i<arr.length;i++)
        {
          sum=sum^arr[i];
        }    
   System.out.println("Missing Element is :"+sum);
 }
}
    