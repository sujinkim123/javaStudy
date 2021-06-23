/*
 *     replace / replaceAll
 *     ========  ========== 정규식
 *               [A-Z], [a-z] , => [A-Za-z]
 *               [0-9], [가-힣]
 *    한글자 변경
 */

public class 자바문자열데이터5 {
	public static void main(String[] args) {
		String s = "Hello Java";
		System.out.println(s.replace('a', 'k'));
		System.out.println(s.replace("Hello", "Hi"));
		System.out.println(s); // 원본 변경 X
		String s1 = "Hello 안녕하세요 1234";
		System.out.println(s1);
		System.out.println(s1.replaceAll("[^A-Za-z]", ""));	// 알파벳을 제외하고 나머지를 모두 공백으로 바꿔라
		System.out.println(s1.replaceAll("[^0-9]", ""));
		System.out.println(s1.replaceAll("[^가-힣]", ""));
	}
}
