public class 자바제어문_반복문5 {
	public static void main(String[] args) {
		
		 /* 1###
		  * #2##
		  * ##3#
		  * ###4
		 */ 
		// 줄수 4줄
		for (int i=1; i<=4; i++) {
			for (int j=1; j<=4; j++) {
				if (i==j) {
					System.out.print(j);
				}
				else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
}
