import java.util.Scanner;

public class Question02 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num = stdIn.nextInt();
		
		if (num%3==0) {
			System.out.println(num+"는(은) 3의 배수입니다");
		}
		else {
			System.out.println(num+"는(은) 3의 배수가 아닙니다");
		}
	}
}
