import java.util.Scanner;

public class 자바메소드_호출_결과값 {
	
	// 메소드 처리는 한개의 기능만 받아서 처리한다
	
	static boolean login(String id, String pwd) {
		final String MID="admin";
		final String MPWD = "1234";
		boolean bCheck = false;
		
		if (MID.equals(id) && MID.equals(pwd)) {
			bCheck = true;
		} else {
			bCheck = false;
		}
		return bCheck;
	}
	
	public static void main(String[] args) {
		
		// 사용자로부터 입력값 받기
		Scanner stdIn = new Scanner(System.in);
		System.out.print("ID 입력: ");
		String id = stdIn.next();
		System.out.print("비밀번호 입력: ");
		String pwd = stdIn.next();
		
		// 메소드를 통해서 결과값을 받는다
		boolean check = login(id, pwd);
		if (check==true) {
			System.out.println("메인 화면으로 이동");
		} else {
			System.out.println("ID나 비밀번호가 틀립니다");
		}
	}
}
