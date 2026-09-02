import java.util.*;

public class panagram4 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashSet<Character> hm1=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
                ch=Character.toLowerCase(ch);
                hm1.add(ch);
            }
        }
        if(hm1.size()==26)
            System.out.println("Panagram");
        else
            System.out.println("Not Panagram");
    }
}
