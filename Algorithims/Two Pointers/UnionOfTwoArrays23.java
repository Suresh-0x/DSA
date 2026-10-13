import java.util.*;
class UnionOfTwoArrays23
{
   public static ArrayList<Integer> union(int a[],int n,int b[],int m)
   {
     TreeSet<Integer> set=new TreeSet<>();
      ArrayList<Integer> res=new ArrayList<>();
     for(int i=0;i<n;i++)
       set.add(a[i]);
     for(int j=0;j<m;j++)
     set.add(b[j]);
     for(int ele:set)
       res.add(ele);
     return res;

   }
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n&m values:");
         int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
       for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(int i=0;i<m;i++)
        b[i]=sc.nextInt();
        System.out.print(union(a,n,b,m));
    }
}
