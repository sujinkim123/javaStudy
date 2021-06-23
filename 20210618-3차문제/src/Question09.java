public class Question09 {
	public static void main(String[] args) {
		
		int[] num = new int[10];
		
		for (int i =0; i<num.length; i++) {
			num[i] = (int) (Math.random() * 10)+1;
		}
		for (int i : num) {
			System.out.printf("%d ", i);
		}
		
		System.out.println();
		
		int total = 0;
		for (int i : num) {
			total += i;
		}
		
		System.out.println("평균 : " + total / (double)num.length);
		
	}
}
