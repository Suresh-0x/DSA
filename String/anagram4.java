import java.util.*;
public class anagram4
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
        int[] hm=new int[26];
        for(int i=0;i<s.length();i++)
        {
            hm[s.charAt(i)-'a']++;
            hm[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(hm[i]!=0)
            {
                System.out.println("Not Anagrams");
                return;
            }
        }
        System.out.println("Anagrams");
    }
}
