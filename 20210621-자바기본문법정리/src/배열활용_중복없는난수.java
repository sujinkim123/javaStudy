import java.util.Arrays;

// 1 ~ 45 => 중복 없는 정수 6개

public class 배열활용_중복없는난수 {
	public static void main(String[] args) {
		
		/*
		int[] lotto = new int[6];
		
		for (int i=0; i<lotto.length; i++) {
			lotto[i] = (int) (Math.random()*45) + 1; // 1~45 사이의 임의 정수 대입
		}
		System.out.println(Arrays.toString(lotto));
		*/
		
		// 난수를 발생 시에 중복 체크는 하지 않는다
		/* int[] arr = new int[10];
		for (int i=0; i<arr.length; i++) {
			arr[i] = (int) (Math.random()*10)+1; // 1~10
		}
		System.out.println(Arrays.toString(arr));
		*/
		
		int[] com = new int[10];
		boolean bCheck = false;
		/*
		 * 	bCheck => false => com 배열에 저장
		 *            true  => 난수를 다시 발생 (중복이 없는 경우)
		 */
		
		int rand = 0; // 난수 발생
		
		
		/*
		 * 	i
		 */
		for (int i=0; i<com.length; i++) {
			bCheck = true;
			
			while (bCheck) {
				rand = (int) (Math.random() * 45)+1; // 1~10
				bCheck = false; // for, while문은 무조건 처음부터 수행
				for (int j=0; j<i; j++) {
					if (com[j]==rand) {
						bCheck = true;	// while문을 다시 수행 ==> 중복된 수가 있기 때문에
						break; // 자신의 제어문만 제어한다 ==> for
					}
				}
			}
			// while문 종료가 되면 중복이 없다
			com[i] = rand;
		}
		System.out.println(Arrays.toString(com));
	}
}
