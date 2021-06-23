// A(추상클래스), 	F(종단클래스)= > final = >변경해서사용이안된다(제공한 내용 그대로 사용)

import java.util.Scanner;

// 국어 , 영어 , 수학 ==> 총점 , 평균 , 평균에 대한 학점부여 A(90), B(80), C(70), D(60), F(60미만)
public class 자바다중조건문2 {

	public static void main(String[] args) {
		// 입력값을 받는다
		Scanner stdIn = new Scanner(System.in);
		System.out.print("국어점수 영어점수 수학점수 입력 (90 90 90) : ");
		int kor = stdIn.nextInt();
		int eng = stdIn.nextInt();
		int math = stdIn.nextInt();
		int total = kor + eng + math;
		double avg = total / 3.0;
		int res = (int) avg;
		char grade = 'A';

		if (res >= 90)
			grade = 'A';
		else if (res >= 80)
			grade = 'B';
		else if (res >= 70)
			grade = 'C';
		else if (res >= 60)
			grade = 'D';
		else
			grade = 'F';

		// 결과값 출력
		System.out.println("국어 점수: " + kor);
		System.out.println("영어 점수: " + eng);
		System.out.println("수학 점수: " + math);
		System.out.println("총점: " + total);
		System.out.printf("평균: %.2f\n", avg);
		System.out.println("학점: " + grade);
	}
}
