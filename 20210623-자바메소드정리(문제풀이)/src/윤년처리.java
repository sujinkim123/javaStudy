
public class 윤년처리 {

	// 윤년 처리
	static boolean isYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
	
	// 출력 
	static void print() {
		int year = 자바메소드정리.input("년도");
		boolean check = isYear(year);
		if (check)
			System.out.println(year + "년도는 윤년입니다.");
		else
			System.out.println(year + "년도는 윤년이 아닙니다");
	}

	public static void main(String[] args) {
		print();
	}
}
