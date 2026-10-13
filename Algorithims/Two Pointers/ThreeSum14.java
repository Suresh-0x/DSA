import java.util.*;
class ThreeSum14
{
    static boolean sumcheck(int a[],int n)
    {
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(a[i]+a[j]+a[k] == 0)
                     return true;
                }
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