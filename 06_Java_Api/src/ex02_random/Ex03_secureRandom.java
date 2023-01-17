package ex02_random;

import java.security.SecureRandom;

public class Ex03_secureRandom {

	public static void main(String[] args) {
		
//		java.security.SucureRandom
		
		SecureRandom secureRandom = new SecureRandom();
		
//		정수 난수
		int dice  = secureRandom.nextInt(6) +1 ;	// 주사위 1 ~ 6
		System.out.println(dice);
	}

	
	
}
