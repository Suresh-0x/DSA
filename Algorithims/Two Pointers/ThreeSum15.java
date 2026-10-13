import java.util. *;
class ThreeSum15
{
    static boolean sumcheck(int a[],int n)
    {
        Arrays.sort(a);
        for(int i=0;i<n-2;i++)
        {
            int l=i+1;
            int r =n-1;
            while(l<r)
            {
                int x = a[i]+a[l]+a[r];
                if(x==0)
                 return true;
                else if(x<0)
                 l++;
                else
                 r--;
            }
        }
        return false;
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
      System.out.println("the three sum is exists:"+sumcheck(a,n));

    }
}