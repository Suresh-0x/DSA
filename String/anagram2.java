import java.util.*;
public class anagram2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        if(s.length()!=t.length())
        {
            System.out.println("Not Anagrams");
        }
        HashMap<Character,Integer> hm1=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            hm1.put(ch,hm1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            hm1.put(ch,hm1.getOrDefault(ch,0)-1);
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(hm1.get(ch)!=0)
            {
                System.out.println("Not Anagrams");
                return;
            }
        }
        System.out.println("Anagrams");
    }
}
