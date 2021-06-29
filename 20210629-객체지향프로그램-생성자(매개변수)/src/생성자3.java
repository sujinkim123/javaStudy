class Member {
	int no; // 0
	String name; // null
	String addr; // null
	/*
	 *  Member m1 = new Member();
	 *  Member m2 = new Member();
	 */
	Member() {
		no=1;
		name="홍길동";
		addr="서울";
	}
	Member(int n, String s) {
		this(s); // 생성자 자신 ==> Member(s) => this(s)
		// this 메소드는 생상자 안에서 다른 생성자를 호출할 때 사용
		// 주의점은 항상 생성자 안에서만 사용한다
		// 항상 첫줄에 온다
		no=n;
	}
	Member(int n) {
		no=n;
	}
	Member(String n) {
		name=n;
	}
	Member(String n, String a) {
		name=n;
		addr=a;
	}
	Member(int n, String s, String a) {
		no=n;
		name=s;
		addr=a;
	}
}
public class 생성자3 {
	public static void main(String[] args) {
		Member m1 = new Member();
		System.out.println(m1.no);
		System.out.println(m1.name);
		System.out.println(m1.addr);
		System.out.println("=====================");
		Member m2 = new Member(2,"강감찬");
		System.out.println(m2.no); // 2
		System.out.println(m2.name); // 강감찬
		System.out.println(m2.addr); // null
		System.out.println("=====================");
		Member m3 = new Member("심청이");
		System.out.println(m3.no); // 0
		System.out.println(m3.name); // 심청이
		System.out.println(m3.addr); // null
		System.out.println("=====================");
		Member m4 = new Member("박문수","경기");
		System.out.println(m4.no); // 0
		System.out.println(m4.name); // 박문수
		System.out.println(m4.addr); // 경기
		System.out.println("=====================");
		Member m5 = new Member(3,"이순신","인천");
		System.out.println(m5.no); // 3
		System.out.println(m5.name); // 박문수
		System.out.println(m5.addr); // 경기
		System.out.println("=====================");
	}
}
