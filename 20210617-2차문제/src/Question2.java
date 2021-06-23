import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("금액을 입력하시오 : ");
		int money = stdIn.nextInt();

		int money50000 = money / 50000;
		money = money % 50000;

		int money10000 = money / 10000;
		money = money % 10000;
		System.out.println(money);

		int money1000 = money / 1000;
		money = money % 1000;

		int money100 = money / 100;
		money = money % 100;

		int money50 = money / 50;
		money = money % 50;

		int money10 = money / 10;
		money = money % 10;

		int money1 = money;

		System.out.println("오만원권 " + money50000 + "매");
		System.out.println("만원권 " + money10000 + "매");
		System.out.println("천원권 " + money1000 + "매");
		System.out.println("100원권 " + money100 + "매");
		System.out.println("50원권 " + money50 + "매");
		System.out.println("10원권 " + money10 + "매");
		System.out.println("1원권 " + money1 + "매");
		

	}
}
