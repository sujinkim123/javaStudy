/*
 *  정수 데이터를 1개 저장
 *  int a = 10;
 *  ===     ==
 *   1      2
 *        =
 *        a
 *        
 *  int => 4byte 메모리에 생성
 *  	   ===================
 *  	   10을 메모리에 저장
 *         ===================
 *         저장된 위치를 a라는 이름으로 사용
 *         a = 1000;	// a 값을 1000으로 바꿈
 *          
 *  byte b = 100;
 *  ====
 *       1byte 메모리 공간을 만든다
 *       만들어진 공간에 100을 저장한다
 *       저장된 값을 사용하려면 => b를 이용한다
 *       b = 1000;	// overflow 발생
 *       
 *  boolean b = true;
 *  =======
 *  	  1byte 메모리 공간을 만든다
 *  	  만들어진 공간에 true를 저장한다
 *  	  저장된 값을 사용하려면 => b라는 이름을 이용한다
 *  	  b = false;	// b를 true 값으로 바꿈
 *  
 *  char c = 'A';
 *  ====
 *       2byte 메모리 공간을 만든다
 *       만들어진 공간에 'A'를 저장한다
 *       'A'라는 값을 사용 => c라는 이름을 사용한다
 *       c = 'B'	// c 값을 'B'로 바꿈
 *       
 *  float f    =    10.5;	// 오류 발생
 *  =======         =====
 *   4byte       double(8btye)
 *  					   
 *  4byte 메모리를 생성 => 이름을 f로 생성
 *  f라는 공간에 10.5f을 저장한다
 *  f = 20.0f를 저장한다		10.5f (X) => 20.0f
 *       
 */
public class 증감연산자1 {
	int a = 20; // heap

	public static void main(String[] args) {
		// 같은 블록 안에서는 같은 이름의 변수를 사용할 수 없다
		int a = 10; // stack
		System.out.println(a);
		a = 20;
		System.out.println(a);
		a = 30;
		System.out.println(a);

		// 문자 = 'A'를 저장한다 ==> 'B'로 변경 => 'C'로 변경해서 출력
		char b = 'A';
		System.out.println(b);
		b = 'B';
		System.out.println(b);
		b = 'C';
		System.out.println(b);

		// 논리형 = false => true로 변경해서 출력 (boolean)
		boolean c = false;
		System.out.println(c);
		c = true;
		System.out.println(c);

		// 실수형
		// 4byte에 10.5 실수를 저장한다
		float d = 10.5f; // f, F => float 데이터 표현
		System.out.println(d);

		// int에 (4byte) => 2150000000
		long e = 2150000000L; // 자바에서는 모든 정수값은 int로 인식
		System.out.println(2150000000L);

		byte b1 = 100; // 일반 숫자를 적용 (단, 127을 벗어나면 안된다)
		short s = 200; // 일반 숫자를 대입 (단, 32767을 벗어나면 안된다)
		// byte, short, char => 연산 => 결과값은 int , float , double (크기가 더 큰 데이터형)
		byte b2 = 100;
		byte b3 = 10;
		int b4 = b2 + b3;
	}
}
