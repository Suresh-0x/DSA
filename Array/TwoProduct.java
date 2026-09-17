import java.util.*;
class TwoProduct
{
   static String pairCheck(int a[],int target)
  {
   
      for(int i=0;i<a.length;i++)
	{
	  for(int j=i+1;j<a.length;j++)
	   {
		if(a[i]*a[j]==target)
		   return "YES";
	   }
	}
     return "NO";
  }

   public static void main(String... args)
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter n value:");
          int n=sc.nextInt();
          int a[]=new int[n];
          for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
	  System.out.println("Enter target value:");
          int target=sc.nextInt();
        System.out.println("Pairs Exists: "+ pairCheck(a,target));
    }
}
       