import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99): ");
		int num = stdIn.nextInt();
		int num10 = num/10;
		int num1 = num%10;
		
		if (!(num>=10 && num<=99)) {
			System.out.println("잘못 입력하셨습니다");
		} else if (num10==num1) {
			System.out.println("10의 자리와 1의 자리가 같습니다");
		} else {
			System.out.println("10의 자리와 1의 자리가 다릅니다");
		}
	}
}
