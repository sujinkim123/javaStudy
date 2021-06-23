import java.util.Scanner;

// 국어, 영어, 수학, 점수를 받아서 => 평균, 총점, 학점 : (90, 80, 70, 60, 60)
// switch
// 네트워크 ...

public class 자바선택문4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 요청
		System.out.print("국어점수, 영어점수, 수학점수 입력하세요 (90 90 90) : ");
		int kor = stdIn.nextInt();
		int eng = stdIn.nextInt();
		int math = stdIn.nextInt();
		int total = kor + eng + math;
		double avg = total / 3.0;

		System.out.println("국어점수: " + kor);
		System.out.println("영어점수: " + eng);
		System.out.println("수학점수: " + math);
		System.out.println("총점: " + total);
		System.out.printf("평균: %.2f\n", avg);

		int score = (int) (avg / 10);
		char hakjum = ' ';

		switch (score) {
		case 10: case 9:
			hakjum='A';
			break;
		case 8:
			hakjum='B';
			break;
		case 7:
			hakjum='C';
		case 6:
			hakjum='D';
			break;
		default:
			hakjum='F';
		}
		System.out.println("학점: " + hakjum);
	}
}
