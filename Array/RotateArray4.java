import java.util.*;
class RotateArray4
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
    a.add(0,a.get(a.size()-1));
    a.remove(a.size()-1);
 }
  System.out.println("After Rotate the Array:");
  System.out.println(a);
}
}
    