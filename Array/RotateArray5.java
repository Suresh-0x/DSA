import java.util.*;
class RotateArray5
{
  public static void main(String... args)
  {
      
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value:");
    int n=sc.nextInt();
    System.out.println("Enter k value: ");
    int k=sc.nextInt();
    ArrayList<Integer> a=new ArrayList<>();
    for(int i=0;i<n;i++)
    {
    	a.add(sc.nextInt()); 
    }
  for(int i=1;i<=k;i++)
  {
    a.add(a.size(),a.get(0));
    a.remove(0);
 }
  System.out.println("Anti Clock-Wise:");
  System.out.println("After Rotate the Array:");
  System.out.println(a);
}
}
    