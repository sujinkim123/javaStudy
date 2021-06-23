/*
 *	논리연산자 => && , ||
 *		=> 결과값 ==> boolean (true / false)
 *
 *      형식)
 *            조건 && 조건 ,  조건 || 조건
 *  =============================================
 *                        &&           ||
 *  =============================================
 *   true   true         true          true
 *  =============================================
 *   true   false        false         true
 *  =============================================
 *   false  true         false         true
 *  =============================================
 *   false  false        false         false
 *  =============================================
 *  
 *  => 논리연산자 (효율적인 연산을 한다)
 *                =======================
 *                
 *     &&는 왼쪽 조건 false일 확률이 있는 조건을 사용
 *     			(false) && (조건)
 *              =======     ===== (처리하지 않는다)
 *     ||는 왼쪽 조건 true
 */

public class 자바연산자_논리연산자1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b= 9;
		boolean bCheck1 = (a<b) && (++b==a);
		System.out.println(bCheck1);
		System.out.println(b); // b=9 ( a<b가 false이기 때문에 뒤는 처리하지 않는다)
		
		int c = 10;
		int d = 9;
		boolean bCheck2 = (c<d) || (++d==c);
		System.out.println(bCheck2); // true
		System.out.println(d);  // d=10 ( c<d가 true이기 때무에 뒤는 처리한다) 

	}
}
