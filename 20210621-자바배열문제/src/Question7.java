public class Question7 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int sum = 0;
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = (int) (Math.random()*10)+1; // 1~10
			System.out.print(arr[i]+" ");
			sum += arr[i];
		}
		
		System.out.println();
		System.out.println("평균 : " + sum/10.0);
	}
}
