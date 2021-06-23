public class 자바메소드호출_방식 {
	
	static void a() {
		System.out.println("a() 진입..."); // 2
		b();
		System.out.println("a() 종료..."); // 5
	}
	
	static void b() {
		System.out.println("b() 진입..."); // 3
		System.out.println("b() 종료..."); // 4
	} // a()에서 호출했기 때문에 a()로 이동 => 나머지 문장 수행 
	
	public static void main(String[] args) {
		System.out.println("main() 진입..."); // 1
		a();
		System.out.println("main() 종료... (프로그램 종료)"); // 6
	}
	
	/*
	 *    main() 진입...
	 *    ==> a() 블록으로 이동
	 *        a() 진입...
	 *        ==> a() 블록으로 이동
	 *        b() 진입...
	 *        b() 종료...
	 *        a() 종료...
	 *        main() 종료... (프로그램 종료)
	 *    
	 */
}