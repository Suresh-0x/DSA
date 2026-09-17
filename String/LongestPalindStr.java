import java.util.*;
class LongestPalindStr
{
    public static int longestPalindrome(String s)
    {
	HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
	{
	   map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
	}
	int sum=0,count=1;
        for(char ch:map.keySet())
	{
	    int value=map.get(ch);
          if(value%2!=0&&count==1)
	 {
             sum+=map.get(ch);
	      count++;
	 }
	  else if(value%2==0)
	   sum+=map.get(ch);
	}
return sum;
}
   public static void main(String... args)
   {
         Scanner sc=new Scanner(System.in);
         String s=sc.next();
         System.out.println(longestPalindrome(s));
     }
}