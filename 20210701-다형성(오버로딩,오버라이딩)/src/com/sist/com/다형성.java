package com.sist.com;
/*
 *    오버로딩 (추가) / 오버라이딩 (변경)
 *    ========================================================================
 *                            오버로딩                   오버라이딩
 *    ========================================================================
 *         상태              한 개의 클래스               상속관계
 *    ========================================================================
 *        메소드                 동일                       동일
 *    ========================================================================
 *       매개변수       개수나 데이터형이 다르다            동일
 *    ========================================================================
 *        리턴형               관계없음                     동일
 *    ========================================================================
 *                                                   접근제어자가 확장 / 접근제어자를 축소(X)
 *    ========================================================================
 *                                  public > protected > default > private
 *                                  
 *    1. 데이터 보호 (캡슐화)
 *    2. 재사용 (상속, 포함)
 *    3. 수정, 추가 (다형성) => 한개의 메소드이름으로 여러개의 기능 제작
 *    
 *    클래스의 크기
 *    =============
 *       상속 , 포함
 *       
 *    class A {
 *    } 
 *    class B {    // A와 B는 크기를 비교할 수 없다  
 *    }
 *    =======================================================
 *    class A {
 *    }
 *    class B extends A {  // A클래스가 B클래스보다 크다
 *    }
 *    =======================================================
 *    class A {
 *    }
 *    class B {  // B클래스가 A보다 크다
 *        A a;
 *    }
 *    
 *    =======================================================
 *    상속과정에 클래스 생성
 *    class A
 *    class B extends B
 *    
 *    A a = new A();
 *    B b = new B();
 *    A c = new B(); (O)
 *    B d = new A(); (X) => 형변환 오류
 *    
 *    형변환
 *    class A
 *    class B extends A
 *        
 *    A a = new A();
 *    B b = new B();
 *    
 *    a=b => 사용이 가능
 *    동물 = 인간 => 인간은 동물이다 (O)
 *    b=a => 사용이 불가능
 *    인간 = 동물 => 동물은 인간이다 (X)
 *    ==> b=(인간) a;
 *    자바에서 => 라이브러리 만들 때 클래스를 리턴할 때 => Object => 형변환
 *    
 *    ==> class A
 *        class B extends A
 *        ***
 *        A a = new B();
 *        1. 생성자 (new B()) => a.(메소드) => B클래스의 변수
 *        2. 클래스명 (A) => a.(변수) => A클래스의 변수
 *        
 *    예)
 *        class A {
 *            int a==10;
 *            public void display() {
 *                System.out.println(100);
 *            }
 *        }
 *        class B extends A {
 *            int a = 20;
 *            public void display() {
 *                System.out.println(200);
 *            }
 *        }
 *        
 *        A a = new B();
 *        a.display();  // 200
 *        a.a = 10;
 *        a.aaa(); // 호출할 수 없다
 */

class A {
	int aa = 100;
	public void display() {
		System.out.println("A:display()...");
	}
}

class B extends A {
	int aa = 200;
	public void display() {
		System.out.println("B:display()...");
	}
	
	public void connection() {
		System.out.println("B: connection() ...");
	}
}

public class 다형성 {

	public static void main(String[] args) {
		
		A a = new A(); // aa.display()
		System.out.println(a.aa);
		a.display();
		
		B b = new B(); // aa.display(), connection();
		System.out.println(b.aa);
		a.display();
		
		A c = new B(); // aa , display() => (B => display())    interface, 추상클래스
		System.out.println(c.aa);
		c.display();
		
		B d = (B) c;
		// d = (B) a;
		// B d = (B) a; // connection
		System.out.println(d.aa);
		d.display();
		d.connection();
		
		// 클래스 생성 => 클래스명 객체명 = new 클래스명();
		//                ========              ======== 동일(O)
		//                ========              ======== 동일(X) => 인터페이스 , 추상클래스
		// List list = new ArrayList();
		
		Object o = new A();
		
		A aa = (A) o;
		aa.display();
		
		/*
		 *   상위 클래스 = 하위 클래스 : 형변환(Down) => 생략 불가능
		 *   하위 클래스 = 상위 클래스 : 형변환(Up) => 생략 가능
		 */
	}
}
