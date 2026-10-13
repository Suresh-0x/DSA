import java.util.*;
class VowelAnxiety
{ 
   public static String vowelAnxiety(String s1)
   {
	char ch[]=new char[s1.length()];
        int l=0,r=ch.length-1;
	int i=s1.length()-1;
	boolean b=false;
	String vowels="aeiou";
	while(i>=0)
	{
          if(!b)
	  {
	      ch[r]=s1.charAt(i);
	      r--;
	     if(vowels.indexOf(s1.charAt(i))!=-1)
	      {
		b=true;
	       }
	   i--;
         }
	else
	{
           ch[l]=s1.charAt(i);
	      l++;
	     if(vowels.indexOf(s1.charAt(i))!=-1)
	      {
		b=false;
	       }
		i--;
        }
     }

	  
	return new String(ch);  

   }
        
  public static void main(String... args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a String :");
      String s1=sc.next();
        System.out.print("Final String is :"+vowelAnxiety(s1));
    }
}