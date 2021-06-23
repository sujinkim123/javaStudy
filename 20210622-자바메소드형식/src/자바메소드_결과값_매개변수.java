import java.util.Scanner;

// 사칙연산 처리 => 메소드
public class 자바메소드_결과값_매개변수 {

	static int plus(int a, int b) {
		return a + b;
	}

	static int minus(int a, int b) {
		return a - b;
	}

	static int multiply(int a, int b) {
		return a * b;
	}

	static double divide(int a, int b) {
		return a / (double) b;
	}

	static void calc() {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("첫번째 정수 입력: ");
		int a = stdIn.nextInt();
		System.out.print("두번째 정수 입력: ");
		int b = stdIn.nextInt();

		System.out.print("연산자 입력(+,-,*,/): ");
		// Scanner의 단점 : char를 받을 수 없다 => 문자열
		String op = stdIn.next();

		switch (op) {
		case "+": {
			int c = plus(a, b);
			System.out.println(c);
		}
			break;
		case "-": {
			int c = minus(a, b);
			System.out.println(c);
		}
			break;
		case "*": {
			int c = multiply(a, b);
			System.out.println(c);
		}
			break;
		case "/": {
			if (b == 0) {
				System.out.println("0으로 나눌 수 없습니다");
			} else {
				double d = divide(a, b);
				System.out.printf("%.2f\n", d);
			}
		}
			break;
		}
	}

	public static void main(String[] args) {
		calc();
	}
}
