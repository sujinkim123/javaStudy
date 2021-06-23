import java.util.Scanner;

/*
 *   charAt(int) : 문자열 중에 문자 한 개를 추출 ==> char
 *   
 *   String s = "Hello Java!!";
 *    Hello Java!!   ===> 배열형태 (시작번호가 0부터 시작)
 *    01234567891011
 *    
 *    charAt(0) ==> 'H'
 *    charAt(6) ==> 'J'
 *    charAt(4) ==> 'o'
 *    
 *    사용자가 알파벳을 입력해주면 ==> 'A', 'a' ==> 몇개
 */
public class 자바문자열데이터2 {
	public static void main(String[] args) {
		
		/* String s = "Hello Java!!";
		System.out.println("첫번째 문자: " + s.charAt(0));
		System.out.println("여섯번째 문자: " + s.charAt(6));
		*/
		
		// 사용자가 알파벳을 입력해주면 ==> 'A', 'a' ==> 몇개
		// 1. 입력값 받기 => 메모리에 저장
		Scanner stdIn = new Scanner(System.in);
		System.out.print("알파벳 여러개 입력: ");
		String data = stdIn.next();
		System.out.println("받은 데이터: " + data);
		// 'a' , 'A'
		int count = 0; // 몇개인지 확인
		for(int i = 0; i<data.length(); i++) {
			char c = data.charAt(i); // 입력된 문자열에서 문자 한개씩 가지고 온다
//			System.out.println(c);
			if (c == 'A' || c == 'a')
				count++; // 'A', 'a' 몇개인지 확인
		}
		System.out.println("A, a는 " + count + "개입니다");
	}
}
