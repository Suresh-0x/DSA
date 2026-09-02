import java.util.*;
public class anagram3 
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
        int[] hm1=new int[26];
        int[] hm2=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            hm1[ch-'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            hm2[ch-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(hm1[i]!=hm2[i])
            {
                System.out.println("Not Anagrams");
                return;
            }
        }
        System.out.println("Anagrams");
    }
}
