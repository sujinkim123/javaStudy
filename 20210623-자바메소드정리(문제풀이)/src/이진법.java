public class 이진법 {
	
	// 이진법 처리
	static void binary(int[] arr, int value) {
		int index = 15;
		while (true) {
			arr[index] = value%2;
			value/=2;
			if(value==0)
				break;
			else
				index--;
		}
	}
			
    // 출력
	static void print() {
		int num = 자바메소드정리.input("0~32767까지 정수 입력: ");
		int[] arr = new int[16];
		binary(arr, num);
		for (int i=0; i<16; i++) {
			if (i%4==0 && i!= 0)
				System.out.println(" ");
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		print();
	}

}
