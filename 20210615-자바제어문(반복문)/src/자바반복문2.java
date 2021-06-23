// 1 ~ 100 까지의 총합
public class 자바반복문2 {

	public static void main(String[] args) {
		// 1. 1 ~ 100까지 합을 누적할 변수 (누적 변수)
		int sum = 0; // 누적곱 => 1
		// 짝수합, 홀수합, 총합
		int sum1 = 0;
		int sum2 = 0;
		for (int i=1; i<=100; i++) { // 1~100까지 반복
			sum+=i;	// sum = sum + i
//			System.out.println("i="+i+",sum="+sum);
			if (i%2==0)
				sum1+=i;
			else
				sum2+=i;
		}
		System.out.println("1~100까지의 합 : " + sum);
		System.out.println("1~100까지의 짝수의 합 : " + sum1);
		System.out.println("1~100까지의 홀수의 합 : " + sum2);
		
		// 1~100까지 3의 배수, 5의 배수, 7의 배수의 개수
		int count3 = 0;
		int count5 = 0;
		int count7 = 0;
		
		for (int i=1; i<=100; i++) {
			// 3의 배수라면 count3++
			if (i%3==0)
				count3++;
			// 5의 배수라면 count5++
			if (i%5==0)
				count5++;
			// 7의 배수라면 count7++
			if (i%7==0)
				count7++;
		}
		System.out.println("1~100까지 3의 배수의 개수 : " + count3);
		System.out.println("1~100까지 5의 배수의 개수 : " + count5);
		System.out.println("1~100까지 7의 배수의 개수 : " + count7);
	}
}
