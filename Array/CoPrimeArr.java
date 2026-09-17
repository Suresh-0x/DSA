import java.util.*;
public class CoPrimeArr
{
    public static int gcd(int a,int b)
    {
        while(a>0&&b>0)
        {
        if(a>b)
        a=a%b;
        else 
        b=b%a;
        }
        if(a==0)
        return b;
        else
        return a;
    }
    public static void main (String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter n values: ");
       int n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
       }
       int ans=gcd(a[0],a[1]);
       for(int i=2;i<n;i++)
       {
           ans=gcd(a[i],ans);
       }
       if(ans==1)
       System.out.println("Given Integer Array is Co-prime");
       else
       System.out.println("Given Integer Array is Not Co-prime");
       
    }
    
}
