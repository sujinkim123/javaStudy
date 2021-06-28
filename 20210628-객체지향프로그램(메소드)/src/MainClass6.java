public class MainClass6 {

	void connection() {
		connection();
		System.out.println("오라클 드라이버 등록");
		System.out.println("오라클 연결");
		disconnection();
	}

	void disconnection() {
		connection();
		System.out.println("오라클 드라이버 해제");
		System.out.println("오라클 연결 종료");
		disconnection();
	}

	void select() {
		connection();
		System.out.println("SELECT 문장 수행");
		System.out.println("오라클 결과값 읽기");
		disconnection();

	}

	void insert() {
		connection();
		System.out.println("INSERT 문장 수행");
		System.out.println("오라클에서 데이터 추가");
		disconnection();

	}

	void update() {
		connection();
		System.out.println("UPDATE 문장 수행");
		System.out.println("오라클에서 데이터 수정");
		disconnection();

	}

	void delete() {
		connection();
		System.out.println("DELETE 문장 수행");
		System.out.println("오라클에서 데이터 삭제");
		disconnection();

	}

	public static void main(String[] args) {
		MainClass6 m = new MainClass6(); // m => select(), insert(), update(), delete()
		m.connection();
		m.select();
		m.insert();
		m.update();
		m.delete();
		m.disconnection();
	}
}
