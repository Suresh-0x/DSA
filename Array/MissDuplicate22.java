import java.util.*;
class MissDuplicate22
{
public static void main(String... args)
      {
 	Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:\t");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<arr.length;i++)
       {
         map.put(arr[i],map.getOrDefault(arr[i],0)+1);
       }
       for(int i=0;i<arr.length;i++)
       {
         if(map.get(arr[i])==2)
        {
         System.out.println("Duplicate Element: "+arr[i]);
          break;
         }
       }
        for(int i=0;i<arr.length;i++)
       {
        if(!(map.containsKey(i+1)))
        {
          System.out.println("Missing Element: "+(i+1));
           break;
         }
      }

  }
}

       