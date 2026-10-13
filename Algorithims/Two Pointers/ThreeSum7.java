import java.util. *;
class ThreeSum7
{
    static int[] sumcheck(int a[],int n,int target)
    {
        Arrays.sort(a);
        for(int i=0;i<n-2;i++)
        {
            int l=i+1;
            int r =n-1;
            while(l<r)
            {
                int x = a[i]+a[l]+a[r];
                if(x==target)
                 return new int[]{a[i],a[l],a[r]};
                else if(x<target)
                 l++;
                else
                 r--;
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