import java.util.*;
class ArrayUnique4
{
  public static void main(String... args)
  {
      
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value:");
    int n=sc.nextInt();
    int a[]=new int[n];
    HashMap<Integer,Integer> res=new HashMap<>();
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
        res.put(a[i],res.getOrDefault(a[i],0)+1);
     }
  if(res.size()==n)
  System.out.println("Array is Unique");
  else
  System.out.println("Array is not Unique");
  }
}