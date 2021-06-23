import java.util.Scanner;

public class 자바메소드_달력만들기프로그램 {

	// 입력
	static int input(String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.print(msg + " 입력:");
		return scan.nextInt();
	}

	// 요일 출력
	static void weekPrint() {
		String[] strWeek = { "일", "월", "화", "수", "목", "금", "토" };
		for (String s : strWeek) {
			System.out.print(s + "\t");
		}
		System.out.println();// 다음줄에 출력
	}

	// 윤년 확인
	static boolean isYear(int year) {
		boolean bCheck = false;

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			bCheck = true;

		return bCheck;
	}

	// 요일구하기 (처리)
	static int weekData(int year, int month) {
		// 1. 전 년도까지의 합
		int total = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		// 2. 전 달까지의 합
		/*
		 * case 2: total+=31 3 total+=31+28 4 total+=31+28+31
		 */
		int[] lastday = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		/*
		 * if((year%4==0 && year%100!=0)||(year%400==0))// 윤년 2월 => 29 lastday[1]=29;
		 * else lastday[1]=28;
		 */
		if (isYear(year))
			lastday[1] = 29;
		else
			lastday[1] = 28;

		for (int i = 0; i < month - 1; i++) {
			total += lastday[i];
		}

		// 3. +1
		total++; // 각 달의 1일자 확인
		int week = total % 7;// 요일

		return week;
	}

	// 마지막 일 구하기
	static int getLastDay(int month) {
		int[] lastday = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		return lastday[month - 1];
	}

	// 
	static void datePrint(int month, int week) {

		for (int i = 1; i <= getLastDay(month); i++) {
			if (i == 1) {
				for (int j = 0; j < week; j++) {
					System.out.print("\t"); // 공백
				}
			}
			System.out.printf("%2d\t", i);
			week++;
			if (week > 6) {
				week = 0;
				System.out.println();
			}
		}
	}

	
	public static void main(String[] args) {
		int year = input("년도");
		int month = input("월");

		System.out.println(year + "년도 " + month + "월");

		// 요일 출력
		weekPrint();

		int week = weekData(year, month);

		// 출력
		datePrint(month, week);
	}
}
