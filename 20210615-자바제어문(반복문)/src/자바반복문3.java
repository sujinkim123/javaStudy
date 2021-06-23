import java.util.Scanner;

// 정수 1개를 받아서 => 해당 구구단 출력 (2단 ~ 9단까지 입력)
public class 자바반복문3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("2~9까지 단 입력 : ");
		int dan = stdIn.nextInt();
//		System.out.printf("%d * %d = %d\n", dan, 1, dan*1);
//		System.out.printf("%d * %d = %d\n", dan, 2, dan*2);
//		System.out.printf("%d * %d = %d\n", dan, 3, dan*3);
//		System.out.printf("%d * %d = %d\n", dan, 4, dan*4);
//		System.out.printf("%d * %d = %d\n", dan, 5, dan*5);
//		System.out.printf("%d * %d = %d\n", dan, 6, dan*6);
//		System.out.printf("%d * %d = %d\n", dan, 7, dan*7);
//		System.out.printf("%d * %d = %d\n", dan, 8, dan*8);
//		System.out.printf("%d * %d = %d\n", dan, 9, dan*9);
		for (int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
	}
}
