import java.util.Scanner;

public class Question11 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num = stdIn.nextInt();
		int sum = 0;
		for (int i=1; i<=num; i++) {
			sum+=i;
		}
		System.out.println("1~"+num+"까지의 합:"+sum);
	}
}
