/*
 *  1. 변수
 *  ===========
 *  2. 연산자
 *  3. 제어문
 *  =========== 기본 코딩
 *  4. 묶어서 사용
 *     = 데이터 묶는 방법
 *         = 같은 것끼리 묶어서 (크기가 동일:배열)
 *         = 다른 것기리 묶어서 (클래스)
 *           ===> 클래스 안에서 설정 할 수 있는 데이터형
 *                기본형 (int, byte, short, char, long, float, double, boolean)
 *                클래스 (클래스 , 배열)
 *         = 명령문 묶는 방법
 *           = 메소드 (연산자, 제어문, 지역변수)
 *  ============================================================================== 클래스 + 메소드 (242 page)
 *  5. 클래스 영역
 *     클래스 (구성요소)
 *     =======================
 *         변수
 *           = 인스턴스 => new를 사용해서 메모리 생성 => 따라 메로리가 생성
 *           = 정적변수(클래스변수) => static => 메모리 한개만 생성 => 공유 데이터
 *           
 *           => 생성 방법
 *              class A {
 *                  int aa;
 *                  static int bb;
 *              }
 *              
 *              A a = new A(); ===> a(aa) ==> a가 aa에 접근시에는 a.aa
 *              A b = new B(); ===> b(aa) ==> b가 aa에 접근시에는 b.aa
 *                => 별도로 bb가 생성 =========> a,b 공통으로 사용이 가능하다
 *                   a.bb (객체명으로 접근이 가능) , A.bb (클래스명.변수)
 *     ======================= 
 *         메소드
 *     =======================
 *         생성자
 *     =======================
 */

class A {
	String name;
	int aa;
	static int bb;
	// 변수 => 초기화(지역변수) , 멤버변수 (인스턴스, static) => 자동 초기화
	/*
	 * String => null char => ' ' double => 0.0 float => 0.0f int => 0 long => 0L
	 * 클래스 => 주소값이 없는 경우 (null)
	 */
}

public class 데이터형만들기 {

	public static void main(String[] args) {
		
//		A a = new A();
		// 249 page
		System.out.println(A.bb);
		A a = new A(); // name, aa
		System.out.println(a.aa);
		a.bb=100;
		System.out.println(a.name);
	}
}
