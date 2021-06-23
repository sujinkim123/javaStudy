/*
 * 	데이터형 변경
 * =============== 숫자에 대해서만 가능 (boolean은 포함할 수 없다)
 * 정수/실수/문자만 가능하다 (클래스도 가능)
 * 
 * 예) 정수 => 실수 변경 upcasting	==> 자동형변환 (시스템에서 알아서 변환)
 *     실수 => 정수 변경  downcasting ==> 강제형변환 (개발자가 직접 변환)
 *     문자 => 정수로 변경 upcasting 
 *     정수 => 문자로 변경 downcasting
 *     문자 => 실수로 변경 upcasting
 *     
 *     ===> 자바에서 연산처리 (같은 데이터형만 가능하다) => 가장 큰 데이터값이 결과값
 *          10 + 10.5 =====> 20.5
 *          ==
 *          10.0
 *          
 *          'A' + 10 
 *          ===
 *          int => 65 + 10 => 75
 *          
 *          'A' + 10 + 20.5
 *          ========
 *          'A' => 65 + 10
 *          75 + 20.5
 *          ==
 *          75.0 + 20.5 => 95.5
 *          
 *          10.5 + 10.5 = 21.0
 *          (int)10.5 + (int)10.5	=> 실수를 정수로 변환 => 소수점을 지운다
 *          =========   =========
 *             10		   10
 *                    + => 20
 *                    
 *          => 데이터 크기
 *             byte < short < int < long < float < double
 *                    char 
 *                    
 *          => byte + byte = int
 *             char + char = int
 *             short + short = int          
 *             
 *             byte + char + short = int
 *             
 *             => byte, short, char가 연산되면 결과값이 int
 *             
 *         * 변수가 여러개
 *         int a = 10;
 *         int b = 20;
 *         int c = 30;
 *         
 *         int a=110, b=20, c=30;  // 같은 데이터형일 때만 가능
 *         
 *         // 사용자의 입력값을 받는 경우, 난수값을 받는 경우
 *         int a, b;
 *         a=10;
 *         b=20;
 */

public class 형변환연산자1 {
	public static void main(String[] args) {
//		System.out.println((int) Math.ceil(235 / 10.0)); // 총페이지
//		System.out.println((int) (Math.random() * 101)); // 0~100 사이의 난수
		
//		System.out.println((char)('A' + 32));
		
		// 변수에 'A'를 저장했다가 출력
		char a = 'A';
		System.out.println(a);
		
		// 'A'가 가지고 있는 정수 출력
		System.out.println((int)a);
		
		// 'a'를 저장하고 정수 출력
		char b = 'a';
		System.out.println((int)b);
		
		// 70을 저장한 다음에 => 70에 해당되는 알파벳을 출력 
		int c = 70;
		System.out.println((char)c);
		
		// char c1 = 70;
		// System.out.println(c1);
		
		// 'A'+1 ==> int
		// 'A'+'B' => int
		
		// 10/3 ==> 3	10/(double)3 => 3.33333
		// double d = 10/3; => 3.0
		double d = 10/(double)3;
		System.out.println(d);
		/*
		 *  int a=123456;
		 *  double d=123456.78;
		 *  (int) ((d-a)*100)
		 */
		 /* int a1=123456;
		 double d1=123456.78;
		 int r = (int)((d1-a1)*100);
		 System.out.println(d1-a1);
		 System.out.println((int) ((d1-a1)*100));
		 */

	}
}
