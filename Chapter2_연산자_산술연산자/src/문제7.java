
public class 문제7 {
	public static void main(String[] args) {
        int num1=10, num2=10;   
        int a, b;   
        num1 = num1 + 1;
        a = num1;
        System.out.printf("%d, %d \n", a, num1);
        b = num2;
        num2 = num2 + 1;
        System.out.printf("%d, %d \n", b, num2);
        // num1=11 a=11 num2=11 b=10
	}
}
