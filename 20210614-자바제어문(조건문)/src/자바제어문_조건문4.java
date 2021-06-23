import java.util.Scanner;

/*
 * 	1. 국어, 영어, 수학, 점수를 입력 받아서 => Scanner
 *  2. 평균, 총점 출력
 *  3. 학점 => 평균 : 90 이상 A
 *                    80 이상 B
 *                    70 이상 C
 *                    60 이상 D
 *                    60 미만 F
 *                    =========== 다중조건 (일단 단일조건으로 풀어서 코딩)
 *                    
 *                    
 *  자바의 전체 구조
 *  ================
 *  1. package => 폴더 소속 (경로)
 *  2. import => 외부에 잇는 자바파일 읽기(클래스) => 여러개 사용이 가능
 *  3. public class ClassName
 *     {
 *       ==========================
 *        멤버변수(전역변수) : 여러 개 설정 가능
 *       ==========================
 *        기능 설정 (메소드) : 여러 개 설정 가능
 *       ==========================
 *        변수에 대한 초기화 (생성자)
 *       ==========================
 *        public static void main(String[] args {
 *            절차적 언어 : 한번 사용하고 버린다 , 순차적으로 코딩...
 *        }
 *       ==========================
 *     }
 *     
 *     절차적 언어
 *     ===========
 *     물을 마시고 싶다
 *     ================
 *     1. 삽을 든다
 *     2. 땅을 판다
 *     3. 물을 마신다
 *     4. 다른 땅을 판다
 *     
 *     물을 마시고 싶다
 *     ================
 *     정수기 => 호수만 연결
 */
public class 자바제어문_조건문4 {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("국어 영어 수학 점수 입력(90 90 90): ");
		int kor = stdIn.nextInt();
		int eng = stdIn.nextInt();
		int math = stdIn.nextInt();
		double avg = (kor+eng+math)/3.0;
		
		System.out.println("국어 점수: " + kor);
		System.out.println("영어 점수: " + eng);
		System.out.println("수학 점수: " + math);
		System.out.println("총점: " + (kor+eng+math));
		System.out.printf("평균: %.2f\n",(kor+eng+math)/3.0);

		/*
		 * 		"총점:"+80+90+70
		 *      ==========
		 *      "총점:80"
		 *                 ==
		 *                 "총점:8090"
		 *                    ==
		 *                    "총점:809070"
		 *      문자열 + any type (모든 데이터형) ==> 문자열
		 *      ""
		 *      any type(모든 데이터형) + 문자열 ==> 문자열
		 *      
		 *      "총점:"+(80+90+70)
		 *              ==========
		 *                  1
		 *      ======
		 *        2            
		 */
		
		// 학점
		char grade = 'A';
		
		if (avg>=90 && avg<=100)
			grade='A';
			
		if (avg>=80 && avg<90)
			grade='B';
		
		if (avg>=70 && avg<80)
			grade='C';
		
		if (avg>=60 && avg<70)
			grade='D';
		
		if (avg<60)
			grade='F';
		
		System.out.println("학점: " + grade + "학점");
		
	}
}
