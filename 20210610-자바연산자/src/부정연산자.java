// ! ==> true / false만 사용 => 결과값은 반드시 boolean
public class 부정연산자 {
	
	public static void main(String[] args) {
		
		boolean bCheck = false;
		System.out.println(bCheck);
		bCheck=!bCheck;	// !false => true
		System.out.println(bCheck);
		
		// id 중복체크 ==> 아이디가 없는 경우 (0) , 아이디가 있는 경우 1
		/*
		 * 	booelan bCheck = false
		 * 	if (id==0) 
		 * 	    bCheck = true
		 *  else 
		 *      bCheck = false
		 *  ================================ 서버   
		 *  bCheck ====> 전송 (브라우저)
		 *  if (bCheck==true)
		 	    사용이 가능한 아이디입니다
		 	else
		 		이미 사용중인 아이디입니다	
		 *  ================================== 클라이언트
		 */
		// 부정 => 반대  !
	}
}
