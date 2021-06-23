import java.util.Scanner;

// 국어 영어 수학 점수를 받아서 평균, 총점 구하기

// => 직접 입력 , 사용자 입력값 , 난수(컴퓨터)
/*
 *  ① 직접 입력
 *  int kor = 90;
 *  int eng = 100;
 *  
 *  ② 사용자 입력값
 *  Scanner 사용
 *  
 *  ③ 난수(컴퓨터)
 *  Math.random
 */

public class 자바연산자정리4 {

	public static void main(String[] args) {
		// Scanner를 생성 => 클래스는 생성 => new => 메모리에 저장
		Scanner stdIn = new Scanner(System.in);
		// System.in(입력값을 읽는 경우 : inputStream, System.out(화면 출력 : outputStream)
		System.out.print("국어 점수를 입력하세요 : ");
		int korean = stdIn.nextInt();	// 입력된 정수를 받아오는 기능 (nextInt())
		System.out.print("영어 점수를 입력하세요 : ");
		int english = stdIn.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		int math = stdIn.nextInt();
		
		System.out.println("=============결과=============");
		System.out.printf("세 과목의 평균 점수는 %.1f점입니다.\n", (double)(korean+english+math)/3);
		System.out.printf("세 과목의 총점은 %d점입니다.", korean+english+math);
		
		/*
		 * 	next() ===> 문자열(String) 
		 *  nextInt() ===> 정수(int)
		 *  nextBoolean() ===> true/false
		 *  nextDouble() ===> 실수
		 */
	}
}
