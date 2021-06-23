import java.util.Scanner;

public class 달력만들기프로그램 {

	public static void main(String[] args) {
		
		// 입력값 받기
		Scanner stdIn = new Scanner(System.in);
		System.out.print("년도 입력: ");
		int year = stdIn.nextInt();
		System.out.print("월 입력: ");
		int month = stdIn.nextInt();
		
		System.out.printf("%d년도 %d월\n", year, month);
		
		String[] strWeek = {"일", "월", "화", "수", "목", "금", "토"};
		
		for (int i=0; i<strWeek.length;i++) {
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println("\n");
		
		// 각 달의 마지막 날짜 
		int[] lastday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// 6월 1일자의 요일 구하기
		// 전년도까지의 총 일 수 구하기
		int total = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		// 전달까지의 총 일 수 구하기
		if ((year%4==0) && year%100!=0 || (year%400==0)) // 윤년 조건 (ERP)
			// 2월달이 29
			lastday[1] = 29;
		else
			lastday[1]=28;
		
		for (int i=0; i<month-1;i++) {
			total+=lastday[i];
		}
		
		// +1
		total++; // 6월 1일자
		
		// %7 => 요일을 구할 수 있다
		int week = total%7;	// 1년도 1월 1일 => 월
		
		// 달력 출력
		for (int i=1; i<=lastday[month-1];i++) {
			if (i==1) { // 첫 줄에 출력시에는 요일까지 공백 출력
				// 빈 공백 출력
				for (int j=0; j<week; j++) {
					System.out.print("\t");
				}
			}
			// 1일부터 출력
			System.out.printf("%2d\t", i);
			week++; // 요일 증가
			if (week>6) { // 일요일이면 (6=토요일)
				week=0;
				System.out.println();
			}
		}
	}
}
