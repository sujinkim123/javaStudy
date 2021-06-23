import java.util.Scanner;

public class Question06 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 입력:");
		int score = stdIn.nextInt();
		char grade = 'A';

		switch (score / 10) {
		case (10):
		case (9):
			grade = 'A';
			break;
		case (8):
			grade = 'B';
			break;
		case (7):
			grade = 'C';
			break;
		case (6):
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}

		System.out.println(grade + "학점입니다");
	}
}
