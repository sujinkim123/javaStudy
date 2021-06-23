public class Question06 {
	public static void main(String[] args) {

		for (int i = 10; i <= 99; i++) {
			if (i % 10 == i / 10) {
				System.out.printf("%d ", i);
			}
		}
	}
}
