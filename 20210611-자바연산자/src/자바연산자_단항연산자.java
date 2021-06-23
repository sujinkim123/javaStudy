/*
 *  자바에서 지원하는 연산자
 *  단항연산자 : 피연산자 (연산대상 1개) ++a	!bCheck		(char)65
 *  	= 증감연산자 (++, --)
 *  	= 부정연산자 (!)
 *  	= 형변환연산자 ((데이터형)값)	(double)10  , (int)10.5
 *  이항연산자 : 피연산자 2개 ==> 10+20
 *  	= 산술연산자 (+ , - , * , / , %)
 *      = 쉬프트연산자 (비트이동연산자 : 왼쪽, 오른쪽)
 *        10<<2	 ===> 10*2^2   x<<y  => x*2^y
 *        ==
 *        1010     => 101000 = 40
 
 *        10>>2  ===> 10/2^2  10/4 => 2 
 *        ==
 *        1010	==> 10 = 2
        = 비트연산자 ( & (*) , | (+) , ^)
        	1010 => 10
        	1111 => 15
        	====&
        	1010 => 10
       	= 비교연산자 ( ==(같다) , !=(같지 않다) , < (작다) , > (크다), <= 작거나 같다) , >= (크거나 같다))
       	  ===> 결과값은 boolean(true/false)
       	  ===> 비교는 숫자, 문자만 비교가 가능
       	  ===> 문자열 비교 (equals())
       	  byte, short, int, long, double, float, char, boolean 
        = 논리연산자 (&&(직렬) , ||(병렬))
        = 대입연산자 : 결과값을 메모리에 다시 저장 : (=)
        = 복합대입연산자 : (+= , -=) , *= , /= , %= , <<= , >>= , &= , |= , ^=
        				   a++5 => a=a+5	a--5 => a=a-5
        				   a++
        				   a+=1 => a=a+1 
 *  삼항연산자
 * 
 */
public class 자바연산자_단항연산자 {
	public static void main(String[] args) {
		// 단항연산자 ++, --
		/*
		 * ++ (1을 증가한다) -- (1을 감소한다)
		 * 
		 * = 전치연산자 int a = 10; ++a; 
		 * = 후치연산자 int b = 10; b++;
		 * 
		 * int a=10; int b=a++; => 먼저 a가 가지고 있는 값을 b에 대입 => a값을 1 증가 => a=11, b=10
		 * 
		 * int a=10; int b=++a; => b에 값을 대입하기 전에 a값을 먼저 증가 => 증가된 값을 b에 대입 = a=11, b=11
		 */

		char c = 'A';
		System.out.println(c++); // c값을 먼저 출력 ==> c를 1개 증가
		System.out.println(c); // 출력 전에 c를 1개 증가 ==> B

		// 부정연산자 (!) ==> 적용되는 데이터형 boolean
		// true=>false, false=>true 	==> !(조건) 	!(6<7) => false
		boolean bCheck = false;
		System.out.println(!bCheck); // true
	}
}
