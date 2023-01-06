package ex01_variable;  

public class MainClass {  


	
	// single comment
	/* 
	 multiple comment
	 
	 
	  1. 프로젝트 이름 : 마음대로
	  2. 페키지 이름: 모두 소문자 
	  3. 클래스: 첫글자만 대문자 (ex: HellowWorld)
	  4. 메소드 : 첫 글자만 대문자로 작성하고 나머지는 소문자 ( ex:hellowWorld)
	  5. 변수 : 첫 글자만 대문자로 작성하고 나머지는 소문자 ( ex:hellowWorld)
	  6. 상수 : 모두 대문자  HELLO_WORLD
	  
	 */
	/*
	  main 메소드
	  1. Java가 실행될 떄  main 메소드가 실행된다.
	  2. 열린 main 메소드가 없으면 최근에 실행에 성공한  main 메소드를 실행한다.
	  
	 */
	
	

	
	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		
		
//		변수 선언하기(어떤 데이터를 저장할것인가 ? 어떤이름을 사용할것인가)
//		1.primitive type : 기본 타입[소문자로 되어있음],값을 저장하는 타입
//		2.reference type : 참조 타입[첫 글자가 대문자로 되어 있음] .값이 저장된 참조값을 저장하는 타입      (모든 class는 참조 타입) 
//		논리 타입 boolean isGood = true;		   boolean isAlive = false;
		boolean isGood = true;		   
		boolean isAlive = false;
		System.out.println(isGood);
		System.out.println(isAlive);
		
//		문자 타입 (character) : 1 글자
		char ch1 = 'A';
		char ch2 = '홍';
		char ch3 = '\n'; // 라인 피드 - 줄바꿈
		char ch4 = '\t'; // 탭
		char ch5 = '\''; //작은 따옴표
		char ch6 = '\"'; //큰 따옴표
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6);
		
		
// 		정수 타입 
		int age = 46;
		long money = 1000000000L;
		System.out.println(age);
		System.out.println(money);
		
		
//  	정수 구분의 기준
		System.out.println(Integer.MAX_VALUE);
		
		
//		실수 타입
		double leftEye = 0.7;
		double rightEye = 1.2;
		System.out.println(leftEye);
		System.out.println(rightEye);
		
		
//		문자열 타입(여러 글자를 의미 글자수 제한없음)
		String name = "구자영";
		System.out.println(name);
		String country = new String("Korea"); // 대부분의 참조 타입 사용법
		System.out.println(country);
		
//		상수 선언하기[final] 키워드가 필요
		final double PI = 3.141592;
		System.out.println(PI);
		
		
		
		
	}

}
