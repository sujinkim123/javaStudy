
// 사용자 입력
import java.util.Scanner;
/*
 *    11111222223333344444
 *    16781562829234834093048 ==> 일정 패턴 ==> 수열 (이차원)
 *    
 *    *
 *    **
 *    ***
 *    ****
 *    ====================
 *         줄수 별표
 *           i   j  ==> i, j (X) ==> a, b
 *           1   1
 *           2   2
 *           3   3
 *           4   4   => i=1 , j<=i
 *    ****
 *    ***
 *    **
 *    *
 *        줄수 별표
 *          i    j
 *          1    4
 *          2    3
 *          3    2
 *          4    1   => 역순 더한다 => i+j=5 ==> j=5-i
 */

public class 자바반복문5 {
	public static void main(String[] args) {
		// 1. 컴퓨터 => 1 ~ 100 사이의 정수를 저장 (난수 발생)
		int com = (int) (Math.random() * 100) + 1; // 1~100 사이의 난수 발생
		// 2. 저장된 값 맞추는 프로그램

		// 3. 힌트 => UP / DOWN

		// 4. 문제점 : 횟수 지정이 없다 => 무한루프 => 반드시 종료 조건을 추가
		Scanner stdIn = new Scanner(System.in);
		for (;;) { // 무한 루프 => 정답이 있을 때까지 수행
			// 사용자가 입력
			System.out.print("1~100까지 사이의 정수를 입력하세요 : ");
			int user = stdIn.nextInt();
			// 비교 (난수와 입력값 비교) => 난수>입력값 , 난수<입력값 , 난수==입력값
			// 힌트
			if (com>user) {
				System.out.println("입력값보다 큰 정수를 입력하세요");	// UP
			}
			else if (com<user) {
				System.out.println("입력값보다 작은 정수를 입력하세요"); // DOWN
			}
			else {
				System.out.println("정답입니다^^");
				System.out.println("GAME OVER!!!");
				// 반복문을 종료시에 break
				break;
			}
		}

	}
}
