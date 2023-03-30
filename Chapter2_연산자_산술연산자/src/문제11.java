
public class 문제11 {
	public static void main(String[] args) {
		int i=0;
		int re=0;
		i=3;
		re= ++i;
		System.out.println("re:"+re+",i:"+i);
		// i=4 re=4
		i=3;
		re=i++;
		System.out.println("re:"+re+",i:"+i);
		// i=4 re=3
	}
}
