import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num1 = stdIn.nextInt();
		System.out.print("+,-,*,/ 입력:");
		String op = stdIn.next();
		System.out.print("정수 입력:");
		int num2 = stdIn.nextInt();

		switch (op) {
		case "+":
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			break;
		case "-":
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			break;
		case "*":
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
			break;
		case "/":
			if (num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다");
			} else {
				System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
				break;
			}
		default:
			System.out.println("처리할 수 없습니다");
		}
	}
}
