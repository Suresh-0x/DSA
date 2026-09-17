import java.util.*;
import java.math.*;
public class LastOneDi{
    public static void main(String... args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        int f[]=new int[60];
         f[0]=0;
         f[1]=1;
        for(int i=2;i<60;i++)
        {
         f[i]=(f[i-1]+f[i-2])%10;
        }
        System.out.println("last digit is: "+f[n%60]);
         
    }
}

