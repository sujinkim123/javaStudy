import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

// contains => 문자열중에 포함여부 => 검색

public class 자바문자열데이터1 {
	public static void main(String[] args) throws Exception {
		// 입력 =>
		Scanner stdIn = new Scanner(System.in);

		while (true) { // 무한 루프 => 종료하는 조건을 첨부 => for(;;)
			System.out.println("=====================메뉴=====================");
			System.out.println("1. 뮤직 목록");
			System.out.println("2. 뮤직 검색");
			System.out.println("3. 종료");
			System.out.println("==============================================");
			System.out.print("메뉴 선택=>(목록:1,검색:2,종료:3):");
			int menu = stdIn.nextInt();

			if (menu == 3) {
				break; // 반복문을 중단
				/*
				 * <a href="#" class="title ellipsis" title="재생"
				 * onclick="fnPlaySong('93522004','1');return false;"> 추적이는 여름 비가 되어</a>
				 */

			} else if (menu == 1) {
				Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get(); // 웹사이트 연결
				Elements a = doc.select("a.title");
				for (int i = 0; i < 50; i++) {
					System.out.println((i + 1) + ", " + a.get(i).text());
				}
			} else if (menu == 2) {
				System.out.print("검색어 입력:");
				String fd = stdIn.next();

				Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get(); // 웹사이트 연결
				Elements a = doc.select("a.title");
				for (int i = 0; i < 50; i++) {
					if (a.get(i).text().contains(fd)) {
						System.out.println((i + 1) + ", " + a.get(i).text());
					}
				}

			} else { // default => 1, 2, 3 외 다른 번호 선택시 처리하는 문장
				System.out.println("메뉴를 선택하세요");
			}
		}
		System.out.println("프로그램 종료");
	}
}
