// 메소드 유형
/*
 *      리턴형   /   매개변수
 *        O              O     ==> 아이디 중복 체크 true / false => oracle 0/1 ==> COUNT(*)
 *        O              X     ==> 목록 => 임의의 정수 (난수)
 *        X              O     ==> 구구단 (한단) => 메소드 자체 출력
 *        X              X     ==>  데이터 수집
 */
import java.util.Scanner;

public class 자바메소드_3 {
	
	// 1번째 유형
	static boolean isIdCheck(String id) { 
		
		boolean bCheck = false;
		// 반복문 => 항상 처음부터 데이터를 가지고 온다
		String[] ids = {"admin", "hong", "shim", "park", "lee", "kim"};
		for(String s : ids) { // 배열, 컬렉션(ArrayList, Map, Vector, Queue, Stack, LinkedList): 자료구조
			if (id.equals(s)) { // equals => 대소문자를 구분 O, equalsIgnoreCase : 대소문자 구분 X
				bCheck = true;
				break;
			}
		}
		return bCheck;
	}
	
	// 2번째 유형
	static int rand() {
		return (int) (Math.random()*100)+1;
	}
	// 메소드 자체에서 처리 (출력, 오라클 저장, 수정 , 삭제 요청 ...)
	
	// 3번째 유형
	static void gugudan(int dan) { 
		for (int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
	}
	
	// 4번째 유형
	// 데이터 수집 ==> insert , XML ... (출력)
	static void dataFind() {
		String[] ids = {"admin", "hong", "shim", "park", "lee", "kim"};
		System.out.println("======= 아이디 목록 =========");
		for (String s : ids) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		
		boolean bCheck = isIdCheck("kim");
		if (bCheck) {
			System.out.println("이미 사용중인 아이디입니다");
		} else {
			System.out.println("사용 가능한 아이디입니다");
		}
		
		int a = rand();
		System.out.println("임의의 정수: " + a);
		
		gugudan(5);
		
		dataFind();
	}
}
