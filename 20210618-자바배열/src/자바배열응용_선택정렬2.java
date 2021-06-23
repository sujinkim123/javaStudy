import java.util.Arrays;

// 알파벳을 정렬

public class 자바배열응용_선택정렬2 {

	public static void main(String[] args) {

		char[] alpha = new char[7];

		// ASC => 오름차순
		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = (char) ((Math.random() * 26) + 65);
		}
		System.out.println("랜덤 배열 발생 : " + Arrays.toString(alpha));

		// Arrays.sort(alpha);
		for (int i = 0; i < alpha.length - 1; i++) {
			for (int j = i + 1; j < alpha.length; j++) {
				// 교환
				if (alpha[i] > alpha[j]) {
					char temp = alpha[i];
					alpha[i] = alpha[j];
					alpha[j] = temp;
				}
			}
		}
		
		
		
		for (int i = 0; i < alpha.length - 1; i++) {
			for (int j = i + 1; j < alpha.length; j++) {
				// 교환
				if (alpha[i] < alpha[j]) {
					char temp = alpha[i];
					alpha[i] = alpha[j];
					alpha[j] = temp;
				}
			}
		}
		
		/*
		 * 	int a=10;
		 *  int b=20;
		 *  
		 *  a=b; // a=20
		 *  b=a; // b=20
		 *  =============
		 *  
		 *  int temp=a; ==> temp=10;
		 *  a=b; ==> a=20
		 *  b=temp; ==> b=10
		 */
		
		System.out.println("랜덤 배열 오름차순 정렬: "+Arrays.toString(alpha));
		
		

		// String s = "ADBHCEOPEK"; ===> DESC (내림차순)
		String s = "ADBHCEOPEK";
		char[] alpha2 = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			alpha2[i] = s.charAt(i);
		}
		System.out.println(Arrays.toString(alpha2));
		for (int i = 0; i < alpha2.length - 1; i++) {
			for (int j = i + 1; j < alpha.length; j++) {
				// 교환
				if (alpha2[i] > alpha2[j]) {
					char temp = alpha2[i];
					alpha2[i] = alpha2[j];
					alpha2[j] = temp;
				}
			}
		}
		
		s = s.valueOf(alpha2);
		System.out.println("오름차순 정렬(선택정렬): " + s);
		
		
		// 버블정렬
		for (int i=0; i<alpha.length-1;i++) {
			for (int j=0; j<alpha.length-1-i; j++) {
				if (alpha[j]<alpha[j+1]) {
					char temp = alpha[j];
					alpha[j] = alpha[j+1];
					alpha[j+1]=temp;
				}
			}
		}
		s = s.valueOf(alpha2);
		System.out.println("오름차순 정렬(버블정렬): " + s);
		
		
		
		for (int i=0; i<alpha.length-1;i++) {
			for (int j=0; j<alpha.length-1-i; j++) {
				if (alpha[j]<alpha[j+1]) {
					char temp = alpha[j];
					alpha[j] = alpha[j+1];
					alpha[j+1]=temp;
				}
			}
		}
		
		System.out.println(s);
		
	}
}
