import java.util.*;

public class panagram1
 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
                ch=Character.toLowerCase(ch);
                hm.put(ch,hm.getOrDefault(ch,0)+1);
            }
        }
        if(hm.size()==26)
            System.out.println("Panagram");
        else
            System.out.println("Not Panagram");
    }
}
