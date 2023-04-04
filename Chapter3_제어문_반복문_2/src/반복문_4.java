// while 주로 사용되는 곳
import java.io.*;
public class 반복문_4 {
	public static void main(String[] args) {
		try 
		{
			int i=0;
			FileReader fr=
					new FileReader("C:\\javaDev\\eclipse\\.eclipseproduct");
			while((i=fr.read())!=-1) // -1 => 파일 종료
			{
				System.out.print((char)i);
			}
		}catch(Exception ex) {}
	}
}
