import java.util. *;
class ThreeSum8
{
    static int[] sumcheck(int a[],int n,int target)
    {
        for(int i=0;i<n;i++)
        {
         HashSet<Integer> hs = new HashSet<>();
         for(int j=i+1;j<n;j++)
         {
            int x = target-a[i]-a[j];
            if(hs.contains(x))
             return new int[]{a[i],a[j],x};
            hs.add(a[j]);
         }
 
        }
        return new int[]{-1,-1,-1};
    }
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter no of Elements");
       int n = sc.nextInt();
       int a[] = new int[n];
       System.out.println("Enter Elements");
       for(int i=0;i<n;i++)
       {
        a[i] = sc.nextInt();
       } 
       System.out.println("Enter target value");
       int target = sc.nextInt();
      int res[] = sumcheck(a,n,target);
      System.out.println(Arrays.toString(res));


    }
}