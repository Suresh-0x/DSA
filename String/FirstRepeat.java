import java.util.*;
class FirstRepeat
{
 public static void main(String... args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a String:");
   String s=sc.next();
   LinkedHashMap<Character,Integer> res=new LinkedHashMap<>();
   for(int i=0;i<s.length();i++)
   {
    res.put(s.charAt(i),res.getOrDefault(s.charAt(i),0)+1);
   }
  for(char ch:res.keySet())
  {
    if(res.get(ch)>1)
    {
     System.out.println("First Repetating charcter is: "+ch);
      break;
    }
  }
}
}