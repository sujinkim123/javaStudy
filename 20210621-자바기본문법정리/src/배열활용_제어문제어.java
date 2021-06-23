import java.util.Scanner;

public class 배열활용_제어문제어 {

	public static void main(String[] args) {
		
		String[] names = {"홍길동", "심청이", "박문수", "춘향이", "김두환",
				          "이순신", "강감찬", "을지문덕", "이산", "소서노"};
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String name = stdIn.next();
		boolean bCheck = false;	
		
		for (int i=0; i<names.length; i++) {
			if (name.equals(names[i])) {
				System.out.println(name + "는(은) " + (i+1) + "번째에 존재합니다");
				bCheck=true;
				break;
			} 
		}
		
		if (bCheck == false) {
		 System.out.println(name + "는(은) 존재하지 않습니다!!");
		}
	}
}
