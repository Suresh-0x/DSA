import java.util.*;
public TwoSum1
{
    static boolean twosum(int ar[],int n,int target)
    {
         int i,j;
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if((ar[i]+ar[j])==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		if(twosum(a,n,target))
		{
		    System.out.println("Yes");
		}
		else
		{
		    System.out.println("no");
		}
	}
}