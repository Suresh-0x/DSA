import java.util.*;
class ThreeSum
{ 
  public static boolean threeSum(int a[],int n,int target)
  {
     for(int i=0;i<n;i++)
      {
	for(int j=i+1;j<n;j++)
        {
	  for(int k=j+1;k<n;k++)
	  {
	     if(a[i]+a[j]+a[k]==target)
              return true;
	  }
	}
      }
return false;
}
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value:");
 	int n=sc.nextInt();
	int a[]=new int[n];
       System.out.println("Enter target Value:");
       int target=sc.nextInt();
	for(int i=0;i<n;i++)
	 a[i]=sc.nextInt();
       System.out.println(threeSum(a,n,target));
   }
}