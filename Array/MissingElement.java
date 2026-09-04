import java.util.*;
class MissingElement
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
          sum+=arr[i];
        }
     int total=(n*(n+1))/2;
   System.out.println("Missing Element is :"+(total-sum));
 }
}
    