public class Question08 {

	public static void main(String[] args) {
		int[] num = {94, 98, 95, 88, 90};
		
		int min = num[0];
		int max = num[0];
		
		for (int i : num) {
			if (i<min)
				min = i;
			if (i>max)
				max = i;
		}
		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);
	}
}
