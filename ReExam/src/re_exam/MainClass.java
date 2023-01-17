package re_exam;

public class MainClass {
	
	public static void ex04() {
// 문제 4. 월 -> 계절과 마지막 일 출력하기
//	month % 12 / 3 	겨울: 0 봄 : 1 여름 : 2 가을 :3
		
	int month =1;
	String[]season = {"겨울","봄","여름","가을"};
	int[]lastDay = {0,31,28,31,30,31,30,31,31,30,31,30};
	if(month <0 || 12) {
		System.out.println(month +" 월은 잘못된 입력입니다 ");
		return;
		
	}
	System.out.println(month + " 월은" + season[month %12 / 3] +"입니다");
	System.out.println(month + (month +"월은"+lastDay[month]);
	}
	
	public static void ex03() {
	
//	 문제3 삼각형 넓이 구하기
		
		int width = 3;
		int height = 3;
		double area = width * height / 0.5;
		
		System.out.println("삼각형 넓이 :" +area);
	
	}
	
	public static void ex02() {
//		문제 2. 나이에 따른 구분하기
//		0~7 : 미취학아동
//		8~13 : 초등학생
//		14~16 : 중학생
//		17~79 : 고등학생
//		20~100 : 성인
//		나머지 : 잘못된 나이
		
		String strAge = "100";
		int age = Integer.parseInt(strAge);
		if(age<0 || age> 100) {
			System.out.println("잘못된 나이");
		}else if(age<=7){
			System.out.println("미취학 아동");
			
		}else if(age<=13){
			System.out.println("초등학생");
		}else if(age<=16){
			System.out.println("중학생");
		}else if(age<=19){
			System.out.println("고등학생");
		}else {
			System.out.println("성인");
		}


		
	}
	
	public static void ex01() {
		// 절대값 구하기
		int number = 5;
//		int absNumber;
//		if(number>=0) {
//			absNumber = number;
//		}else {
//			absNumber = number * -1;
//		}
		int absNumber = (number >= 0) ? number : -number;
		System.out.println(absNumber);
	}
	
	public static void main(String[] args) {
		ex04();

	}

}
