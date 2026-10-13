import java.util. *;
class ThreeSum11
{

    static int[] sumcheck(int a[],int n,int target)
    {
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(a[i]+a[j]+a[k] == target)
                     return new int[]{i,j,k};
                }
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