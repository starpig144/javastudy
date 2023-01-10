package ex01_one_dim;

public class test_01 {

	public static void ex01() {
	
	        int[] iArr = {100, 95, 80, 70, 60};
	        
	        int total = 0;
	        for(int i = 0 ; i < iArr.length; i++){
	        		
	        	total += iArr[i];
	          
	            System.out.println("합계 :" + total);
	        }
	}
	public static void main(String[] args) {

ex01();
	}

}
