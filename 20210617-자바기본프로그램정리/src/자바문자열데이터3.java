/*
 *     substring(int begin)
 *     substring(int begin, int end)
 *     
 *     "Hello Java!!"
 */
public class 자바문자열데이터3 {

	public static void main(String[] args) {
		String s = "Hello Java!!";
		System.out.println(s.substring(6)); // Java!!
		System.out.println(s.substring(6,10)); // Java
		System.out.println(s.substring(0,5)); // Hello
	}
}
