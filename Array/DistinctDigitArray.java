import java.util.*;
class DistinctDigitArray
{

    public static void distDigit(int arr[]) 
    {
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            int n=arr[i];
            while(n!=0)
            {
                int d=n%10;
                if(!(res.contains(d)))
                {
                    res.add(d);
                }
                n/=10;
            }
        }
       System.out.println("Distinct Digits in Array are: ");
        System.out.println(res);
    }
  public static void main(String... args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value: ");
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    distDigit(a);
 }
};