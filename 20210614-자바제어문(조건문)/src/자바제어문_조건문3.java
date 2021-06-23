public class 자바제어문_조건문3 {

	public static void main(String[] args) {
//		char ch = (Math.random())
//		System.out.println((int) 'Z'); // 90
//		System.out.println((int) 'z');	//122
		int a = (int)(Math.random()*2);	// 0.0*2 ==> 0.0 , 0.99 * 2 => 1.9 ...
		
		char ch = (char) ((Math.random() * 26) + 65); // 0 ~ 25 발생 => 65 	'A'=>65 , 'Z'=>90  => 0~25+65
		
		if (a==0)
			ch = (char) ((Math.random() * 26) + 65); // 대문자
		if (a==1)
			ch = (char) ((Math.random() * 26) + 97); // 소문자
		if (a==2)
			ch = (char) ((Math.random() * 10) + 48); // '0' , '1' ~~~ '9'
		
//		System.out.println(ch);
		
		// 대문자 조건 (ch>='A' && ch<='Z') 	&&: 범위 포함 (이고)
		if(ch>='A' && ch<='Z')
			System.out.println(ch+"는(은) 대문자입니다");
		
		// 소문자 조건 (ch>='Z' && ch<='z')		||: 범위 밖에 있는 경우 (이거나)
		if (ch>='a' && ch<='z')
			System.out.println(ch+"는(은) 소문자입니다");
		
		// 알파벳이 아닌 경우 (대문자나 소문자가 아닌 경우)
		if (!((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')))
			System.out.println(ch + "은(는) 알파벳이 아닙니다");
	}

}
