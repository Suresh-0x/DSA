import java.util.*;
class LargestEleInArr
{ 
public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value: ");
      int n=sc.nextInt();
       PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(b-a));
	for(int i=0;i<n;i++)
	{
          int x=sc.nextInt();
           pq.add(x);
	}       
        System.out.print("Largest Element is: "+pq.poll());
      
   }
}
