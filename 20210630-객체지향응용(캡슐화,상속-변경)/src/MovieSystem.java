
public class MovieSystem {

	public static void main(String[] args) {

		Reserve r = new Reserve();
		System.out.println("========= Reserve End =========");
		
		DaumReserve d = new DaumReserve();
		System.out.println("========= DaumReserve End =========");
		
		NaverReserve n = new NaverReserve();
		System.out.println("========= NaverReserve End =========");
	}
}
