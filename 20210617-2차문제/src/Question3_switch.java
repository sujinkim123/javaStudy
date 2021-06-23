import java.util.Scanner;

public class Question3_switch {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("달을 입력하세요 : ");
		int month = stdIn.nextInt();

		switch (month) {
		case (3):
		case (4):
		case (5):
			System.out.println("봄");
			break;
		case (6):
		case (7):
		case (8):
			System.out.println("여름");
			break;
		case (9):
		case (10):
		case (11):
			System.out.println("가을");
			break;
		case (12):
		case (1):
		case (2):
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못 입력하셨습니다");
		}
	}
}
