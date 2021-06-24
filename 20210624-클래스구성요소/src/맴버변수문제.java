public class 맴버변수문제 {
	
	//Question1
	class signUp {
		String id;
		String name;
		String pwd;
		String pwd_chk;
		String pwd_hint;
		String pwd_answer;
		String sex_code;
		String phoneNumber;
		String faxNumber;
		String mobileNumber;
		String email;
		String post;
		String address;
		String address_detail;
	}
	
	//Question2
	class employee {
		int empno;
		String ename;
		String job; // 직위
		int mgr; // 사수번호
		String hireDate; // 입사일
		int sal; // 급여
		int comm; // 성과급
		int deptno; // 부서번호
	}
	
	//Question3
	class noticeBoard {
		int num;
		String id;
		String title;
		String date;
	}
	
	//Question4
	class restaurantWebsite {
		String title;
		String poster;
		String subHeading; // 제목 밑에 있는 문장
	}
	
	//Question5
	class restaurant {
		String restaurant_name;
		double rating;
		String address;
		String phoneNumber;
		String price;
		boolean free_parking;
		String openingHours;
		String breakTime;
		String dayOff;
		String[] menu;
		int good;
		int soso;
		int bad;
	}
	
	//Question6
	class Movie {
		String title;
		boolean isShow;
		String releaseDate;
		double rating;
		String genre;
		int audience;
		String country;
		int boxofficeRank;
		String grade;
		int cookie;
		int runningTime;
		String postser; // 포스터그림
		String explanation; // 설명
	}
	
	// Quesiton7
	class recipeWebsite {
		String image;
		String title;
		String id;
		int star; 
		int comment; // 댓글
		long views; // 조회수 
	}
	
	// Question8
	class Blog {
		int rank; // 순위
		int id;
		int article; // 작성글 개수
		long share; // 공유 횟수
		long views; // 조회수
		long subscriber; // 구독수
	}

	public static void main(String[] args) {

	}
}
