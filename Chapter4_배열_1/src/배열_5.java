import java.util.Arrays;

public class 배열_5 {
	public static void main(String[] args) {
		char[] arr=new char[20];
		for(int i=0;i<arr.length;i++)
		{
			int n=(int)(Math.random()*2);//0,1
			if(n==0)
				arr[i]=(char)((Math.random()*26)+65);
			else
				arr[i]=(char)((Math.random()*26)+97);
		}
		System.out.println(Arrays.toString(arr));
		//대문자 / 소문자
		int count1=0,count2=0;
		String m1="",m2="";
		for(char a:arr)
		{
			if(a>='A'&&a<='Z')
				count1++;
			else
				count2++;
			if(a>='A'&&a<='Z')
				m1+=a;
			else
				m2+=a;
		}
		System.out.println("대문자 갯수:"+count1);
		System.out.println("소문자 갯수:"+count2);
		System.out.println(m1+" "+m2);
	}
}
