/*
 * 	A
 *  AB
 *  ABC
 *  ABCD
 *  
 *   i       j
 *  줄수  알파벳
 *   1      1(A)
 *   2      2(AB)
 *   3      3(ABC)
 *   4      4(ABCD)
 *   
 *   for(int i =1; i<=4; i++) {
 *   	char c = 'A';
 *   	for (int j=1; j<=i; j++) {
 *   	  System.out.print(c++);
 *   	}
 *   System.out.println();
 *   }
 */

public class 자바제어문_반복문3 {
	public static void main(String[] args) {

		 //  A
		 //  AB
		 //  ABC
		 //  ABCD
		/* for (int i = 1; i <= 4; i++) {
			char c = 'A'; // 한 줄 시작할 때마다 A로 시작
			for (int j = 1; j <= i; j++) {
				System.out.print(c++);
			}
			System.out.println();
		} */
		
		
		// ABCD
		// EFG
		// HI
		// J
		char c = 'A';
		for (int i = 1; i <=4; i++) {
			for (int j = 4; j >= i; j--) {	// for (int j=1; j<=5-i; j++) 도 가능
				System.out.print(c++);
			}
			System.out.println();
		}	
	}
}