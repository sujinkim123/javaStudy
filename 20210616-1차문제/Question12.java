public class Question12 {
	public static void main(String[] args) {
		for (int i = 1; i <= 30; i++) {
			if (i % 2 == 0) {
				System.out.printf("%2d\t", i);
				if (i % 3 == 0)
					System.out.println();
			}
		}
	}
}
