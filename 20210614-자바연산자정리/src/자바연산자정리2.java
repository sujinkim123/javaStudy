/*
 *	출력 => print, println, printf
 *  입력
 *  입력을 받을 수 있는 클래스를 읽어 준다 : Scanner => 라이브러리 scanf() 
 */

import java.util.Scanner;

// java , javax (JDK1.2이상) => xml, servlet, jsp
// 폴더 ==> 자바언어(패키지)
/*
 *  자바
 *  변수 , 연산자 , 제어문
 *         =============== 연산자 + 제어문 (메소드) : 기능을 만들 때 사용
 *  ===============================================
 *  변수 메소드 = 클래스
 *                ======
 *                  여러개를 묶는다 => 패키지
 *                                     ======
 *                                       여러개를 묶는다 => 라이브러리       
 */
public class 자바연산자정리2 {
	public static void main(String[] args) {
		// 클래스 읽기 => int a=10; ==> new 
		Scanner stdIn = new Scanner(System.in);	// System.in => 키보드 입력값
		// new , scan
		// new => malloc() => 승격 => new
		System.out.print("정수를 입력하세요 : ");
		int a = stdIn.nextInt();
		System.out.print("정수를 입력하세요 : ");
		int b = stdIn.nextInt();
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
