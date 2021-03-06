// 재사용 기법 => 상속(IS-A) / 포함(HAS-A)
/*
 *   상속 : 재사용 기법
 *          기존의 클래스를 재사용해서 새로운 클래스를 작성하는 것이다
 *          =============              =============
 *          => 신뢰성이 뛰어나다       
 *          => 코딩을 하지 않는다
 *          => 필요하면 변경해서 사용이 가능하다
 *          => extends 사용 : 상속을 받는다 (자바는 단일상속으로 기본으로 한다)
 *          
 *          기존 클래스 : 부모클래스, 상위클래스, 베이스클래스, 슈퍼클래스 => 상속을 내리는 클래스
 *          새로운 클래스 : 자식클래스, 하위클래스, 파생클래스, 서브클래스 => 상속을 받은 클래스
 *          
 *          *** 유일하게 클래스의 크기를 설정 (상속)
 *              => 상속을 내리는 클래스 : 상속을 내리는 클래스가 받는 클래스보다 크다
 *              => 상속을 받는 클래스
 *          *** 상속 : 기존의 클래스의 모든 것을 받아서 사용이 가능(1.변수 , 2.메소드)
 *                     예외) static : 공동으로 사용이 가능 (공통변수)
 *                           생성자
 *                           private : 자신의 클래스에서만 접근 ==> 상속은 내려간다 ... 접근은 할 수 없다
 *                           ======= protected
 *                           
 *          일반게시판
 *            = 목록 출력
 *            = 내용 보기
 *            = 새글 등록
 *            = 수정하기
 *            = 삭제하기
 *            = 찾기
 *          ================
 *          댓글형 게시판 ==> 일반 게시판으로부터 상속
 *            ===========
 *            = 목록 출력
 *            = 내용 보기
 *            = 새글 등록
 *            = 수정하기
 *            = 삭제하기
 *            = 찾기
 *            ===========
 *            = 댓글 출력, 댓글 쓰기, 댓글 삭제, 댓글 수정
 *            
 *          자료실  ===> 일반 게시판으로부터 상속
 *            = 목록 출력
 *            = 내용 보기 => 다운로드 => 변경
 *            = 새글 등록 => 업로드 => 변경 ==> 오버라이딩
 *            = 수정하기
 *            = 삭제하기
 *            = 찾기
 */

class Super {
	int a;
	static int b;
}

class Sub extends Super {
	// a , b(공통사용)
}

public class MainClass3 {

	public static void main(String[] args) {

		Sub sub = new Sub();
		sub.a = 100;
		sub.b = 200;
		System.out.println("a="+sub.a);
		System.out.println("b="+sub.b);
	}
}
