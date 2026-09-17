import java.util.*;
class SmallestInArr
{ 
public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value: ");
      int n=sc.nextInt();
       PriorityQueue<Integer> pq=new PriorityQueue<>();
	for(int i=0;i<n;i++)
	{
          int x=sc.nextInt();
           pq.add(x);
	}
 
        System.out.print("Smallest Element is: "+pq.poll());
      }
}
