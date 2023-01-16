package ex01_test;


public class Ex01_test {

	
	public static void ex01() {
		
		int serial = 6;
		int mod = serial%2;
	
	if( mod == 0 ) {
		System.out.println("남자");
	}else if( mod == 1) {
		System.out.println("여자");
	}
	}
	

	public static void main(String[] args) {
		ex01();

	}

}
