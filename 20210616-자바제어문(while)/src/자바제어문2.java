import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
 * 	while
 *  형식)
 *           초기값  ==== 1
 *           while(조건식) { ==== 2
 *               반복실행문장 === 3
 *               증가식 === 4 ===> 이동 (증가 후 2번 조건식) 
 *           }
 *           2번에서 조건식이 false이면 while을 종료
 *           
 *           
 *           public static void main(String[] args) {
 *               int a=10;
 *               if (a==10) {
 *                   int b=20;
 *                   if (b==20) {
 *                       int c-30;
 *                       
 *                       // a, b, c 변수 사용가능
 *                   } ====> c 변수는 메모리에서 사라진다
 *                   // a, b 변수 사용가능
 *               } =====> b 변수는 메모리에서 사라진다 ===> 시스템에서 메모리를 관리하는 영역 (스택 => 메모리 자체 관리)
 *                                                          사라지는 시기 => {} (블록변수, 지역변수)
 *               // a 변수는 사용이 가능
 *           }
 *           
 *           변수의 종류
 *           => 지역변수
 *              = 누적변수
 *              = 루프변수
 *              = 플로그변수
 *              
 *              for (int i=1; i<=10; i++) {
 *                  처리
 *              } // i는 사라진다
 *              for(int i=1;i<=10;i++) {
 *              
 *              } // i는 사라진다
 *              
 */

public class 자바제어문2 {
	public static void main(String[] args) throws Exception {

//		// 알파벳
//		char c = 'A'; // 메모리가 main이 종료시까지 유지
//		while(c<='Z') {
//			char c1='A'; // while에서만 사용 => while이 시작할 때 새롭게 메모리 생성
//			System.out.println(c1++);
//			c++;
//		}

		Scanner stdIn = new Scanner(System.in);
		while (true) {// 무한루프 => 종료하는 방법 설정
			System.out.println("======= 메뉴 =======");
			System.out.println("1. 현재 상영 영화");
			System.out.println("2. 개봉 예정 영화");
			System.out.println("3. 영화 예매");
			System.out.println("4. 종료");
			System.out.println("=====================");
			System.out.print("메뉴 선택: ");
			int menu = stdIn.nextInt();

			if (menu == 1) {
//				System.out.println("현재 상영 영화 목록입니다");
				Document doc = Jsoup.connect("https://movie.daum.net/ranking/reservation").get();
				Elements title = doc.select("strong.tit_item");
				for (int i = 0; i < title.size(); i++) {
					System.out.println(title.get(i).text());
				}
			} else if (menu == 2) {
//				System.out.println("개봉 예정 영화입니다");
				Document doc = Jsoup.connect("https://movie.daum.net/ranking/boxoffice/weekly").get();
				Elements title = doc.select("strong.tit_item");
				for (int i = 0; i < title.size(); i++) {
					System.out.println(title.get(i).text());
				}
			} else if (menu == 3) {
				System.out.println("영화 예매 화면입니다");
			} else if (menu == 4) {
				System.exit(0); // 프로그램 종료 (0=>정상종료)
			}
		}
	}
}
