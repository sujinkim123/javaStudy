/*
 * 		단항연산자
 * 		***	증감연산자 (++ , --)
 * 		***	부정연산자 (!) => boolean : true->false , false -> true
 * 		boolean bCheck = false
 * 		while(true) {
 * 			bCheck != bCheck;
 * 			if (bCheck == true)	// 컴퓨터 턴
 * 			else
 * 				사용자 게임 // 사용자 턴
 * 		
 *		}
 *  		반전연산자 (~) => 양수->음수 , 음수->양수  (1의 보수)
 *      *** 형변환연산자 (type) =>  10.5 -> 정수형 -> (int)10.5 -> 소수점 제외 
 *      
 *      이항연산자
 *      ***	산술연산자 (+ , - , * , / , %(나머지))
 *      ***	비교연산자 (== , != , < , > , <= , >=)
 *      ***	논리연산자 (&&(직렬) , || (병렬))
 *      ***	대입연산자 (=)
 *      ***	대입복합연산자 (+= , -= , *= , /= , op= )
 *      	비트연산자 (& , | , ^)
 *      	쉬프트연산자 ( << , >>)  
 *      
 *      삼항연산자
 *      	(조건) ? 값1 : 값2	==> 웹 (if~else)
 *      	예)	sex==1 ? "남자" : "여자"
 *      			if (sex==1)
 *      				남자
 *      			else
 *      				여자
 */

// 증감연산자 ++ , --
/*
 * 	++ , --
 *  전치연산자
 *  후치연산자
 *  
 *  예) int a = 10;
 *  	++a;
 *      a++;	==> a값을 1 증가
 *      출력 : a값 => 12
 */

public class 연산자의종류 {
	public static void main(String[] args) {
		int a = 10;
		int b = a++;
		/*
		 *  int b = a++
		 *      =====
		 *      1. a가 가지고 있는 값을 b에 대입한다
		 *      2. a 값을 1 증가한다
		 *      
		 *  int b = ++a
		 *          ==
		 *      =======
		 *      1. a 값을 1 증가한다
		 *      2. 증가된 값을 b에 대입한다
		 *      
		 *  =================================== a는 무조건 1 증가한다
		 */
	}
}