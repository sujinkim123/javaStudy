public class Practice {

// Question 01
// 다음과 같은 멤버변수를 갖는 SutdaCard 클래스를 정의하시오. 
class SutdaCard {
	
	private int num;
	private boolean isKwang;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean isKwang() {
		return isKwang;
	}
	public void setKwang(boolean isKwang) {
		this.isKwang = isKwang;
	}
}

// Question 02
// 다음과 같은 멤버변수를 갖는 Student 클래스를 정의하시오
class Student {
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
}

// Question 03
// 다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오
/* class PlayingCard {
	int kind; //인스턴스 변수
	int num; // 인스턴스 변수
	static int width; // 정적변수 (공유변수)
	static int height; // 정적변수 (공유변수)

	Playing Card (int k, int n) {
		kind = k; // 지역변수
		num = n; // 지역변수
	}
}*/

// Question 04
// 다음 중 생성자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
/*a. 모든 생성자의 이름은 클래스의 이름과 동일해야한다.
 b. 생성자는 객체를 생성하기 위한 것이다.
 c. 클래스에는 생성자가 반드시 하나 이상 있어야 한다.
 d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다.
 e. 생성자는 오버로딩 할 수 없다.
답 : b , e
b => 객체 생성 : new 생성자 (초기값 설정)
c => 오버로딩 여러개 사용 , 만약에 없는 경우 => 컴파일러가 1개 생성(디폴트 생성자)
 */

// Question 05
// 다음 중 this에 대한 설명으로 맞지 않은 것은? (모두 고르시오)
/* a. 객체 자신을 가리키는 참조변수이다.
   b. 클래스 내에서라면 어디서든 사용할 수 있다.
   c. 지역변수와 인스턴스변수를 구별할 때 사용한다.
   d. 클래스 메서드 내에서는 사용할 수 없다
답: b
b => static 안에서는 this가 존재하지 않는다 / this는 생성자 , 인스턴스 메소드 안에서만 사용이 가능하다
c => 변수명이 동일 할 때
*/

// Question 06
// 다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은? (모두 고르시오)
/* a. 메서드의 이름이 같아야 한다.
   b. 매개변수의 개수나 타입이 달라야 한다.
   c. 리턴타입이 달라야 한다.
   d. 매개변수의 이름이 달라야 한다.
답: c , d
c => 리턴형과 관계없다
d => 이름은 상관없다
 */ 

// Question 07
// 오버로딩의 조건
/* 1. 메소드 이름이 같아야 한다
 * 2. 매개변수의 개수 또는 타입이 달라야 한다
 * 3. 매개변수는 같고 리턴형이 다른 경우는 오버로딩이 성립되지 않는다 
 */

//Question 08
// 다음 중 아래의 add 메서드를 올바르게 오버로딩 한 것은? (모두 고르시오)
/* long add(int a, int b) { return a+b; }
 * a. long add(int x, int y) { return x+y; }
   b. long add(long a, long b) { return a+b; }
   c. int add(byte a, byte b) { return a+b; }
   d. int add(long a, int b) { return (int)(a+b); }
답: b , c , d
 */

//Question 09
// 다음 중 초기화에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
/* a. 멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참고할 수 있다.
   b. 지역변수는 사용하기 전에 반드시 초기화해야 한다.
   c. 초기화 블럭보다 생성자가 먼저 수행된다.
   d. 명시적 초기화를 제일 우선적으로 고려해야 한다.
   e. 클래스변수보다 인스턴스변수가 먼저 초기화된다.
답: c , e
c : 명시적 초기화 => 초기화 블록 => 생성자
e : 컴파일 시 초기화 (static)
*/

//Question 10
// 다음 중 인스턴스 변수의 초기화 순서가 올바른 것은?
/* a. 기본값-명시적초기화-초기화블럭-생성자
b. 기본값-명시적초기화-생성자-초기화블럭
c. 기본값-초기화블럭-명시적초기화-생성자
d. 기본값-초기화블럭-생성자-명시적초기화
답: a
*/

//Question 11
// 다음 중 지역변수에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
/* a. 자동 초기화되므로 별도의 초기화가 필요없다.
   b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다.
   c. 메서드의 매개변수로 선언된 변수도 지역변수이다.
   d. 클래스변수나 인스턴스변수보다 메모리 부담이 적다.
   e. 힙(heap)영역에 생성되며 가비지 컬렉터에 의해 소멸된다. => 클래스변수나 인스턴스변수
답: a , e
e : stack => {} 종료 메모리 자체 관리
*/

//Question 12
// 호출 스택이 다음과 같은 상황일 때 옳지 않은 설명은? (모두 고르시오)
/* a. 제일 먼저 호출스택에 저장된 것은 main메서드이다.
   b. println메서드를 제외한 나머지 메서드들은 모두 종료된 상태이다.
   c. method2메서드를 호출한 것은 main메서드이다.
   d. println메서드가 종료되면 method1메서드가 수행을 재개한다.
   e. main-method2-method1-println의 순서로 호출되었다.
   f. 현재 실행중인 메서드는 println뿐이다.
답 : 
*/ 

//Question 13
// 오버라이딩의 조건으로 옳지 않은 것운? (모두 고르시오)
/* a. 조상의 메서드와 이름이 같아야 한다.
   b. 매개변수의 수와 타입이 모두 같아야 한다.
   c. 접근 제어자는 조상의 메서드보다 좁은 범위로만 변경할 수 있다.
   d. 조상의 메서드보다 더 많은 수의 예외를 선언할 수 있다
답: c , d
 */

//Question 14
// 다음 중 접근제어자를 접근범위가 넓은 것에서 좁은 것의 순으로 바르게 나열한 것은?
/* a. public-protected-(default)-private
   b. public-(default)-protected-private
   c. (default)-public-protected-private
   d. private-protected-(default)-public
답: a
*/

//Question 15
// 접근 제어자가 사용될 수 있는 곳 - 클래스, 멤버변수, 메서드, 생성자
/* (   private  ) - 같은 클래스 내에서만 접근이 가능하다.
   ( default     ) - 같은 패키지 내에서만 접근이 가능하다.
   ( protected     ) - 같은 패키지 내에서, 그리고 다른 패키지의 자손클래스에서 접근이 가능하다.
   ( public    ) - 접근 제한이 전혀 없다.
*/

//Question 16
// 다음 중 접근 제어자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
/* a. public은 접근제한이 전혀 없는 접근 제어자이다.
   b. (default)가 붙으면, 같은 패키지 내에서만 접근이 가능하다.
   c. 지역변수에도 접근 제어자를 사용할 수 있다.
   d. protected가 붙으면, 같은 패키지 내에서도 접근이 가능하다.
   e. protected가 붙으면, 다른 패키지의 자손 클래스에서 접근이 가능하다.
답: c
*/




	public static void main(String[] args) {

	}
}
