import java.util.Arrays;

public class Question10 {
	public static void main(String[] args) {
		
		int[] arr = new int[5];

		// 초기값
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}

		// 정렬 전에 저장된 데이터 출력
		System.out.println("===== 정렬전 =====");
		System.out.println(Arrays.toString(arr));

		System.out.println("===== 정렬후 =====");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) { // < : 내림차순
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
