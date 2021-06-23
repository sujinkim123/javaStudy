import java.util.Arrays;

// 추천 프로그램
/*
 * 	영화추천 => 네이버 (블로그, 카페)
 * =================================== 빈도(언급) ==> REGEX (정규식)
 */
// 204 page
public class 배열활용_빈도수구하기 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		for (int i=0; i<arr.length; i++) {
			arr[i] = (int) (Math.random() * 10); // 0~9까지 사이의 난수
		}
		System.out.println(Arrays.toString(arr));
		int[] count = new int[10];
		for (int i=0; i<arr.length; i++) {
			count[arr[i]]++; // count[6]++ => 1
			// [2, 9, 6, 1, 1, 4, 5, 6, 6, 8]
		}
		for (int i=0; i<count.length;i++) {
			System.out.println(i+"의 개수: "+ count[i]);
		}
	}
}
