import java.util.*;

public class 연습장 {

	public static void main(String[] args) {
		String s="HelloJava";
		char[] c=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			c[i]=s.charAt(i);
		}
		for(int i=0;i<c.length;i++)
		{
			if(c[i]<'Z' && c[i]>'A')
			{
				c[i]+=32;
			}
			else
				c[i]-=32;
		}
		for(char a:c)
		System.out.print(a);
	}
}
