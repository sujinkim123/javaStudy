/*
 * 	조건문 => 오류방지 (처리가 안되는 프로그램 => try ~ catch 예외처리)
 * 
 * *** = 선택 조건문 : true / false => 따로 처리 ( if , else => 한개만 처리)
 *       형식) 
 *             if (조건문) {
 *                 조건이 true일 때 처리 문장
 *             }
 *             else {
 *                 조건이 false일 때 처리 문장
 *             }
 *             
 *      = 다중조건문 : 해당되는 조건만 수행이 가능하게 만든다 (한개의 조건만 실행)
 *        형식)
 *               if(조건문) {
 *                   조건이 true일 때 수행하는 문장 ==> 수행 후에 if문을 종료
 *               } 
 *               else if (조건문) {
 *                   조건이 true일 때 수행하는 문장 ==> 수행 후에 if문을 종료       
 *               }
 *               else if (조건문) {
 *                   조건이 true일 때 수행하는 문장 ==> 수행 후에 if문을 종료
 *               }
 *               else {
 *                   해당 조건이 없는 경우 처리하는 문장 (생략 가능)
 *               }
 *      = 중첩조건문 :  ==> &&로 바꿔서 사용이 가능
 *                 if(a==1) {
 *                     if (b==1) {
 *                     
 *                     }
 *                     else if (b==2) {
 *                     }
 *                 }
 *                 
 *                 ===> if (a==1 && b==1) {
 *                      }
 *                      if (a==1 && b==2) {
 *                      }
 */
public class 자바조건문정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
