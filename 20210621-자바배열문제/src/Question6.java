import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {

		int[] arr = new int[10];
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("↓양의 정수 10개를 입력하세요↓");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = stdIn.nextInt();
			
			if (arr[i]%3==0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
