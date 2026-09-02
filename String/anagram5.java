import java.util.*;
public class anagram5
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
        char[] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String s1 = new String(ch1);
        String s2 = new String(ch2);
        if(s1.equals(s2))
        {
            System.out.println("Anagrams");
        }
        else
        {
            System.out.println("Not Anagrams");
        }
    }
}
