import java.util.*;
class ReverseaWordT4
{
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      String s1=" ";
      Stack<Character> ans=new Stack<>();
      for(int i=0;i<s.length();i++)
        ans.push(s.charAt(i));
      while(ans.size()>0)
       s1+=ans.pop();
      System.out.println("Reverse of a String is: "+s1);    
  }
}