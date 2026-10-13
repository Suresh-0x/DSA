import java.util.*;
class HappyNumber
{
 public static void main(String... args)
 {
   Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value:");
 	int n=sc.nextInt();
    HashSet<Integer> set=new HashSet<>();
    while(n!=1&&!set.contains(n))
    {
        int sum=0;
	set.add(n);
         while(n!=0)
       {
         sum+=n%10*(n%10);
         n/=10;
       }
      n=sum;
     }
     
        if (n == 1)
            System.out.println("Happy number");
        else
            System.out.println("Not happy number");

   }
}
