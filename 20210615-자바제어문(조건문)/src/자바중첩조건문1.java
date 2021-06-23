import java.util.Scanner;

/*
 *  중첩 조건문
 *  형식)
 *        if (조건문)  ===> 아이디 존재하고 {
 *        	if (조건문) ==> 비밀번호가 같다 {
 *        	}
 *        }
 *        
 *        if (컴퓨터==가위) {
 *          if (사용자 == 가위)
 *          else if (사용자 == 가위)
 *          else if (사용자 == 보)
 *       }
 *       
 *       점수 입력
 *       if (socre>=90) ==> A {
 *       	if (score>=98) {
 *       	}
 *       	else
 *             94 이하
 *       }
 */
public class 자바중첩조건문1 {

	public static void main(String[] args) {

		// 1. Scanner 생성 => 입력값을 받아서 저장
		Scanner stdIn = new Scanner(System.in);
		// 2. 사용자 입력 요청
		System.out.print("0~100 사이의 정수를 입력하세요 : ");
		// 3. 사용자가 입력한 정수를 받아서 저장
		int score = stdIn.nextInt();

		char grade = ' '; // A , B , C , D, F
		char option = ' '; // +(98) , -(94이하) , 0
		// 결과값을 출력
		if (score >= 90) {
			grade = 'A';
			if (score >= 98)
				option = '+';
			else if (score < 94)
				option = '-';
			else
				option = 'O';
		} else if (score >= 80) {
			grade = 'B';
			if (score >= 88)
				option = '+';
			else if (score < 94)
				option = '-';
			else
				option = 'O';
		} else if (score >= 70) {
			grade = 'B';
			if (score >= 78)
				option = '+';
			else if (score < 74)
				option = '-';
			else
				option = 'O';
		} else if (score >= 60) {
			grade = 'B';
			if (score >= 68)
				option = '+';
			else if (score < 64)
				option = '-';
			else
				option = 'O';
		} else {
			grade = 'F';
		}

		System.out.printf("학점은 %c%c\n", grade, option);

	}
}
