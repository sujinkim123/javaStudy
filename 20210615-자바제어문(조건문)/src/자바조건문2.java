import java.util.Scanner;
// Math, String, System(클래스) => java.lang ==> 생략이 가능
// 3개 ===> 정수 2개 , 연산자 1개

public class 자바조건문2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("첫번째 정수를 입력하세요 : ");
		int a = stdIn.nextInt();

		System.out.print("두번째 정수를 입력하세요 : ");
		int b = stdIn.nextInt();

		// 연산자 입력
		// Scanner의 단점 : 문자 1개는 받을 수 없다 => String
		System.out.print("연산자(+,-*,/)를 입력하세요 : ");
		char op = stdIn.next().charAt(0);
		// Hello Java ==> charAt(0) ==> H char(1) ==> 문자열은 시작 번호가 0부터 시작한다 char[]
		if (op == '+' || op == '-' || op == '*' || op == '/') {
			if (op == '+')
				System.out.printf("%d + %d = %d\n", a, b, a + b);

			if (op == '-')
				System.out.printf("%d - %d = %d\n", a, b, a - b);

			if (op == '*')
				System.out.printf("%d * %d = %d\n", a, b, a * b);

			// if ~ else => 오류 처리일 경우
			if (op == '/') {
				if (b == 0) { // 0으로 나눌 수 없다
					System.out.println("0으로 나눌 수 없습니다!!"); // 오류 처리
				} else {
					System.out.printf("%d / %d = %.2f\n", a, b, a / (double) b); // 정상 수행
				}
			}
		}
		else {
			System.out.println("사칙연산자가 아닙니다");
		}
	}
}
