import java.util.*;
class TwoProduct1
{
   static String pairCheck(int a[],int target)
  {
    Arrays.sort(a);
    int l=0,r=a.length-1;
    while(l<r)
    {
	int p=a[l]*a[r];
	if(p==target)
         return "YES";
	else if(p>target)
	r--;
	else
	l++;
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
       