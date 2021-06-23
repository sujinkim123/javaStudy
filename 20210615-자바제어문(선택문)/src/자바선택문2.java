import java.util.Scanner;

// 정수 2개 , 연산자 받아서 계산하는 연습 => switch
public class 자바선택문2 {

	public static void main(String[] args) {
		// 1. 키보드 입력값 받기
		Scanner stdIn = new Scanner(System.in);

		System.out.print("첫번째 정수 입력 : ");
		int num1 = stdIn.nextInt();

		System.out.print("두번째 정수 입력 : ");
		int num2 = stdIn.nextInt();

		System.out.print("사칙연산(+, -, *, /) : ");
		switch (stdIn.next()) {
		case "+":
			System.out.printf("%d+%d=%d\n", num1 , num2, num1+num2);
			break;
		case "-":
			System.out.printf("%d-%d=%d\n", num1 , num2, num1-num2);
			break;
		case "*":
			System.out.printf("%d*%d=%d\n", num1 , num2, num1*num2);
			break;
		case "/":
			System.out.printf("%d/%d=%d\n", num1 , num2, num1/num2);
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
		}
	}
}
