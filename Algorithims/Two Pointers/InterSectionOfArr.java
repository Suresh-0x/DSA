import java.util.*;
public class InterSectionOfArr
{
	public static void main(String args[])
      {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m&n Elements");
        int n = sc.nextInt();
        int m=sc.nextInt();
        int a[] = new int[n];
        int b[]=new int[m];
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++)
        {
          a[i] = sc.nextInt();
        } 
      System.out.println("Enter Second Array Elements:");
	
       for(int i=0;i<m;i++)
       {
        b[i] = sc.nextInt();
       } 
	      intersection(a,b);
      }
    }
