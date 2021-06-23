import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {

		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };

		Scanner stdIn = new Scanner(System.in);
		System.out.print("과목 이름 >> ");
		String subject = stdIn.next();
		boolean bCheck = false;
		int res = 0;
		for (int i=0; i < course.length; i++) {
			if (subject.equals("그만")) {
				break;
			}
			if (subject.equals(course[i])) {
				bCheck=true;
				res=i;
				break;
			}
		}
		if (bCheck==false) {
			System.out.println("없는 과목입니다.");
		} else {
			System.out.println(subject + "의 점수는 " + score[res]);
		}
		
	}
}
