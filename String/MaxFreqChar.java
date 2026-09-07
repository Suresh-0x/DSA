import java.util.*;
class MaxFreqChar
{
 public static void main(String... args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a String:");
   String s=sc.next();
   TreeMap<Character,Integer> res=new TreeMap<>();
	for(int i=0;i<s.length();i++)
	{
   		res.put(s.charAt(i),res.getOrDefault(s.charAt(i),0)+1);
	}
	int max=Integer.MIN_VALUE;
	char m=' ';
	Set<Character> se=res.keySet();
	for(char ch:se)
	{
  	  if(res.get(ch)>max)
  	{
     	  max=res.get(ch);
          m=ch;
        }
    }
        System.out.println("Max Frequency charcter is: "+m+" and frequency is: "+max);
   } 
}
        
   