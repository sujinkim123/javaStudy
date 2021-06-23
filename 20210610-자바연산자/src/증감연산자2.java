// ++ , -- : 1 증가 , 1 감소
/*
 * int a = 10;
 * a++; => a+1
 * a++; => a+1
 * ++a; => a+1
 */
public class 증감연산자2 {
	public static void main(String[] args) {
		int a = 10;
//		int b = a++ + ++a + a++ + ++a;
//		System.out.println(a); // 14
//		System.out.println(b); // 48 (10 + 12 + 12 + 14)

//		int b = ++a + ++a; 
//		System.out.println(a); // 12
//		System.out.println(b); // 23 (11 + 12)

//		int b = a++ + a++;
//		System.out.println(a); // 12
//		System.out.println(b); // 21 (10 + 11)

//		int b = ++a + a++;
//		System.out.println(a); // 12
//		System.out.println(b); // 22 (11 + 11)

//		int b = ++a; 
		// 1. a를 1 증가
		// 2. 증가된 값을 b에 대입
//		System.out.println(b); // b=11, a=11

//		c = a++; 
		// 1. c에 a값을 대입
		// 2. a를 1 증가
//		System.out.println(c);	// c=11, a=12

//		int d = 10;
//		int e = d--;
//		System.out.println(d); // d = 2
//		System.out.println(e); // e = 10

//		int k = 10;
//		int m = --k;
//		System.out.println(k); // k = 9
//		System.out.println(m); // m = 9
	}
}
