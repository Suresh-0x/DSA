import java.util.*;
class BitonicArr2
{
  static String checkIsBitonic(int a[],int n)
  {
     if(a[0]==a[1])
     return "NO";
     if(a[n-1]==a[n-2])
     return "NO";
     for(int i=1;i<n-2;i++)
     {
        if(a[i]!=a[i+1])
        return "NO";
      }
     return "YES";

  }
  public static void main(String... args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    System.out.println("The Given array is:"+checkIsBitonic(a,n));
   }
}