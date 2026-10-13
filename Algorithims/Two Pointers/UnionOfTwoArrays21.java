import java.util.*;
class UnionOfTwoArrays21
{ 
   public static ArrayList<Integer> union(int a[],int n,int b[],int m)
   {
     ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            res.add(a[i]);
        }
        for(int i=0;i<m;i++){
            if(!res.contains(b[i])) res.add(b[i]);
        }
        Collections.sort(res);
        return  res;
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