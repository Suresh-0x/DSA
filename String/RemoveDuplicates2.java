import java.util.*;
class RemoveDuplicates2
{
 public static void main(String... args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a String:");
   String s=sc.nextLine();
   LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
   for(int i=0;i<s.length();i++)  
   {
      map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);  
   }
    for(char ch:map.keySet())
    {
      if(map.get(ch)==1)
        System.out.print(ch);
    }
  }
}