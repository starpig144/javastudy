package ex01_one_dim;

public class Ex02_reference {

	
	public static void ex01(){
		
		// 10  : 10진수
		// 10 : 0x10 16진수
	int[]arr;
	
	arr = new int[5];
	
	System.out.println(arr); // 5개 배열 요소의 참조(주소,번지수)
	}
	public static void ex02() {
		int[]a = new int[5];
		int[]b;
		
		b = a;
		System.out.println(b[0]);
	}
	public static void ex03() {
//		생성된 배열의 크기를 늘이는 방법
//		기존 배열
		int[]a= new int[5];
	
//		신규배열
		int[]b= new int[10];
		
//	기존 배열 요소 -> 신규 배열 요소
		
			
// 기존 배열의 참조값을 신규 배열의 참조값으로 수정

//	기존 배열이 신규 배열로 변경되었으므로 확인

	}
	public static void ex07() {
//	배열 초기화
	int[]arr = {10,20,30};
//	배열 순회      
	for(int i = 0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
	}
	public static void ex08() {
		
		String[]weekName = {"토","일","월","화","수","목","금"};
		
		int day = 13;
		
		System.out.println(day+"일은"+ weekName[day%weekName.length] + "요일이다");
	}
	public static void ex09() {
		
		String[]season= {"겨울","봄","여름","가을"};
		int month = 1;
		
		System.out.println(month + "월은"+ season[month%12/3]+"이다");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex02();
	}

}
