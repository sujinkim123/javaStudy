import java.util.Scanner;

public class Question3_if_else {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("달을 입력하세요 : ");
		int month = stdIn.nextInt();

		if (month >= 3 && month <= 5) {
			System.out.println("봄");
		} else if (month >= 6 && month <= 8) {
			System.out.println("여름");
		} else if (month >= 9 && month <= 11) {
			System.out.println("가을");
		} else if (month ==12 || (month <= 2 && month >=1)) {
			System.out.println("겨울");
		} else {
			System.out.println("잘못 입력하셨습니다");
		}
	}
}
