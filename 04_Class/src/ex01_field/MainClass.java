package ex01_field;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		
		// User 타입의 객체 선언
		User user1;
		
		// User  타입의 객체 생성
		user1 = new User();
		
		// 객체 user1의 필드 활용 
		user1.id = "master";
		user1.pw = "654321";
		user1.point =1000;
		user1.isVip = true;
		//user1 의 addr 필드 생성(Address 클래스 타입이기 떄문에 반드시 new를 이용해 생성해야한다.)
		 
		
		
		
 		System.out.println("아이디 : "+user1.id);
		System.out.println("비밀번호 : "+user1.pw);
		System.out.println("포인트 : "+user1.point);
		System.out.println("vip여부 : "+user1.isVip);
		
		
	}

}





		