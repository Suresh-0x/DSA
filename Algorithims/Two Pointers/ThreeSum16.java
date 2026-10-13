import java.util.*;
class ThreeSum16
{
    static boolean sumcheck(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            HashMap<Integer,Integer> hm = new HashMap<>();
            for(int j=i+1;j<n;j++)
            {
                int x = -(a[i]+a[j]);
                if(hm.containsKey(x))
                    return true;
                hm.put(a[j],j);
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
        System.out.println("The three sum exists: " + sumcheck(a,n));
    }
}