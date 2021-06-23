import java.util.Scanner;

public class 자바연산자정리3 {

	public static void main(String[] args) {
		
		// 두 개의 정수를 받아서 => 사칙연산 (+, /, * , %)
		Scanner stdIn = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int a = stdIn.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int b = stdIn.nextInt();
		
		// +
		System.out.printf("%d + %d = %d\n" , a, b, a+b);
		// -
		System.out.printf("%d - %d = %d\n" , a, b, a-b);
		// *
		System.out.printf("%d * %d = %d\n" , a, b, a*b);
		// /
		System.out.printf("%d / %d = %.2f\n" , a, b, a/(double)b);
		
	}
}
