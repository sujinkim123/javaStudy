// 참조 (별칭)
class Student {
	String name;
	int hakbun;
	String sex;
	String subject;
}

public class MainClass2 {
	public static void main(String[] args) {
		
//		Student s; // 메모리에 저장이 안된 상태 => s=null
		
		Student s = new Student();
		/* Student s = new Student();
		s.hakbun = 100;
		System.out.println("s="+s);
		s = new Student();
		System.out.println("s="+s);
		System.out.println(s.hakbun);
		s.hakbun=200;
		System.out.println(s.hakbun);
		s = new Student();
		System.out.println(s.hakbun);
		*/
		s.hakbun=100;
		Student s1 = s; // 참조(별칭) ==> s==s1 => 같은 메모리 공간을 사용
		System.out.println(s1.hakbun); // 100
		s1.name="홍길동";
		System.out.println(s.name);
		
	}
}
