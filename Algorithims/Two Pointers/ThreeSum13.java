import java.util. *;
class ThreeSum13
{
    static int[] sumcheck(int a[],int n,int target)
    {
        for(int i=0;i<n;i++)
        {
         HashMap<Integer,Integer> hm = new HashMap<>();         
         for(int j=i+1;j<n;j++)
         {
            int x = target-a[i]-a[j];
           if(hm.containsKey(x))
                    return new int[]{i,j,hm.get(x)};
            hm.put(a[j],j);
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