import java.util.*;
public class panagram2 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] hm1=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
                ch=Character.toLowerCase(ch);
                hm1[ch-'a']++;
            }
        }
        boolean b=true;
        for(int i=0;i<26;i++)
        {
            if(hm1[i]<=0)
            {
              b=false;
	      break;
	    }
        }
        if(b)
            System.out.println("Panagram");
        else
            System.out.println("Not Panagram");
    }
}
