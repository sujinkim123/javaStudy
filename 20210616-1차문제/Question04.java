import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num = stdIn.nextInt();
		
		if (num<0) {
			System.out.println("a="+num*(-1));
		} else if (num==0) {
			System.out.println("a=0");
		} else {
			System.out.println("a="+num);
		}
	}
}
