import java.util.Scanner;

/*
 * 	3명의 학생
 *      국어, 영어, 수학 ===> 점수를 입력해서
 *      1. 총점
 *      2. 평균
 *      3. 학점
 *      4. 등수
 *      ============ 일반 => 변수 21개
 *      
 *      변수 ==> 응용
 *                 연산자 ===> 응용
 *                             제어문 =====> 응용
 *                                           ====== 배열 =====>
 *                                                      메소드 =====> 응용
 *                                                                클래스 (객체)
 */
public class 자바배열3 {
	public static void main(String[] args) {
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
		int[] gpa = new int[3];
		int[] rank = new int[3];
		
		// int[][] info = new int[3][5];
		//                       --- ---
		//                     인원수 데이터개수
		
		// 1. 키보드 값 받기
		Scanner stdIn = new Scanner(System.in);
		for (int i=0; i<3; i++) {
			System.out.printf("%d번째 국어점수 입력: ", (i+1));
			kor[i] = stdIn.nextInt();
			System.out.printf("%d번째 영어점수 입력: ", (i+2));
			eng[i] = stdIn.nextInt();
			System.out.printf("%d번째 수학점수 입력: ", (i+3));
			math[i] = stdIn.nextInt();
			total[i] = kor[i]+eng[i]+math[i];
			avg[i] = total[i]/3.0;
		}
		
		// 학점
		for (int i=0; i<3; i++) {
			char c = 'A';
			if (avg[i] >=90)
				c='A';
			if (avg[i]>=80)
				c='B';
			if (avg[i] >=70)
				c='C';
			if (avg[i]>=60)
				c='d';
			else
				c='F';
			gpa[i]=c;
		}
		
		// 등수
		for(int i=0; i<3; i++) {
			rank[i] =1;
			for (int j=0; j<3; j++) {
				if (total[i]<total[j])
					rank[i]++;
			}
		}
		
		// 출력
		System.out.println("=============== 성적 목록 ===============");
		System.out.printf("%-1s %-3s%-3s%-5s%-3s%-3s%-5s\n", "국어", "영어", "수학", "총점", "평균", "학점", "등수");
		for (int i=0; i<3; i++) {
			System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-5c%-5d\n", kor[i], eng[i], math[i], total[i], avg[i], gpa[i], rank[i]);
		}
	}
}
