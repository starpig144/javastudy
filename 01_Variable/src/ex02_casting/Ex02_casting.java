package ex02_casting;

public class Ex02_casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
//		강제변환
//		1. 큰크기 ->작은 크기
//		2. 실수 -> 정수

		int n = 256;
		byte bn = (byte)n; // 변수  n을 byte 타입으로 바꾸시오.
		System.out.println(n);
		System.out.println(bn);
		
		
		
		double leftEye = 0.7;
		int ileftEye = (int)leftEye; // 변수 leftEye를 int 타입으로 바꾸시오
		System.out.println(leftEye);
		System.out.println(ileftEye); // 소수점은 항상 잘려나간다.
		
	}

}
