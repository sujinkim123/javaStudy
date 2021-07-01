package com.sist.main;
import com.sist.dao.Oracle;
/*
 *   패키지 => 재사용 (관련된 클래스를 묶어서 저장)
 *          => 사용시 => import 
 */
public class MainClass {
	
	public static void main(String[] args) {
		
		Oracle o = new Oracle();
		o.connection();
		o.disconnection();
	}

}
