import java.util.Scanner;

public class Question01 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num = stdIn.nextInt();
		
		if (num>0) {
			System.out.println(num+"는(은) 양수입니다");
		} else if (num < 0) {
			System.out.println(num+"는(은) 음수입니다");
		} else {
			System.out.println("0입니다");
		}
		
	}
}
