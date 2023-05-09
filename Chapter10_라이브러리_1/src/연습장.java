import java.io.FileReader;
import java.util.*;

public class 연습장 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		try
		{
			FileReader fr = new FileReader("C:\\java_datas\\travel1.txt");
			int i=0;
			StringBuffer sb=new StringBuffer();
			while((i=fr.read())!=-1)
			{
				sb.append((char)i);
			}
			fr.close();
			String[] movies=sb.toString().split("\n");
			for(String m:movies)
			{
				list.add(m);
			}
		}
		catch(Exception ex) {}
		
			for(Object ar:list)
			{
				System.out.println(ar);
			}
	}
}
