import java.util.*;
class KClosestEle2
{
    public static ArrayList<Integer> closestElements(int a[], int n, int k, int x)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<int[]> list = new ArrayList<>();
        for(int i =0;i<n;i++)
        {
            int distance = Math.abs(a[i] - x);
            list.add(new int[]{a[i], distance});
        }

        Collections.sort(list,(p, q)->p[1]-q[1]);
        for(int i = 0;i<k;i++)
        {
            ans.add(list.get(i)[0]);
        }

        return ans;
    }
    public static void main(String... args)
   {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
	a[i]=sc.nextInt();
     System.out.println("Enter K value: ");
     int k=sc.nextInt();
      System.out.println("Enter x value: ");
     int x=sc.nextInt();
    System.out.println(closestElements(a,n,k,x));
   }

}