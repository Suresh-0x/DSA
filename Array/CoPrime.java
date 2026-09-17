import java.util.*;
public class CoPrime
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
       System.out.println("Enter a & b values: ");
       int a=sc.nextInt();
       int b=sc.nextInt();
       if(gcd(a,b)==1)
       System.out.println("Given Integers are Co-primes");
       else
       System.out.println("Given Integers are Not Co-primes");
       
    }
    
}
