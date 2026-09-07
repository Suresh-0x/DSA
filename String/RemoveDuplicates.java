import java.util.*;
class RemoveDuplicates
{
 public static void main(String... args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a String:");
   String s=sc.nextLine();
   LinkedHashSet<Character> set=new LinkedHashSet<>();
   for(int i=0;i<s.length();i++)  
   {
     if(!(set.contains(s.charAt(i))))
       set.add(s.charAt(i));
   }
  String S="";
  for(char ch:set)
  {
    S+=ch;
  }
  System.out.println(S);

  }
}