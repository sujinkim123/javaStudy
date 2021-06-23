/*
 *	161 PAGE 중첩 for (이중 for)
 *  형식)
 *               1     2  => false 전체 종료
 *        for(초기값;조건식;증가식) {	========> 줄 수
 *                     |
 *                     |true
 *                   3      4  => false
 *                                6
 *            for(초기값;조건식;증가식) { ======> 데이터 출력
 *                      5    
 *                반복 실행문장
 *            }
 *        }
 *        
 *        구구단
 *        ======
 *        2*1=2 3*1=3 4*1=4 ..... 9*1=9
 *        2*2=4 .......................
 *        ...
 *        ...
 *        ...
 *        2*9=18                  9*9=81
 *        =============================== 줄 수 (9)
 *          ===> 2차 for ===> 2 ~ 9 
 *        
 *        ***** 가로 (2차)
 *        *****
 *        *****
 *        *****  => 1 ~ 4
 *        세로 (1차)
 *        
 *        *****
 *        *****
 *        *****
 *        *****
 *        *****
 */
public class 자바제어문_반복문2 {
	public static void main(String[] args) {

		// 구구단 출력
		/*
		 * for (int i=1; i<= 9; i++) { for (int j=2; j<=9; j++) { // 구구단 출력 (한줄)
		 * System.out.printf("%d * %d = %2d\n", j , i , j*i); } System.out.println(); }
		 */

		// 별 가로세로 5개
		/*
		 * for(int i=1; i<=5; i++) { for (int j=1; j<=5; j++) { System.out.print("＊"); }
		 * System.out.println(); }
		 */

		// 별 가로10 세로5
		/*
		  for (int i =1; i<=5; i++) { for (int j=1; j<=10; j++) {
		  System.out.print("＊"); } System.out.println(); }
		*/ 

		
		/* for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				if (j % 2 == 0)
					System.out.print("☆");
				else
					System.out.print("★");
			}
			System.out.println();
		} */
		
		
		// ABCD
		// ABCD
		// ABCD
		// ABCD
		/* for (int i=1; i<=4; i++) {
			char c='A';
			for (int j=1; j<=4; j++) {
				System.out.print(c++);
			}
			System.out.println();
		} */
		
		
		// ABCD
		// EFGH
		// IJKL
		// MNOP
		/* char c='A';
		for (int i=1; i<=4; i++) {
			for (int j=1; j<=4; j++) {
				System.out.print(c++);
			}
			System.out.println();
		}*/
	}
}
