
public class Method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sub(3,5));
		System.out.println(mul(3,5));
		System.out.println(gradChar(90.8));
		System.out.println(gradChar(80.0));
		System.out.println(gradChar(50.0));
		showStar(5);
	}
	
	public static int sub(int num1, int num2) {
		int result = num1 - num2;
		return result;
	} 
	public static int mul(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	public static char gradChar(double point) {
		char result;
		if(point >= 90.0) {
			result = '수';
		} else if (point >= 80.0) {
			result = '우';
		} else if (point >= 70.0) {
			result = '미';
		}else if (point >= 60.0) {
			result = '양';
		}else {
			result = '가';
		}
		return result;
	}
	
	public static void showStar(int num) {
		for(int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {				
				System.out.print('*');
			}
			System.out.println();
		}
		
		
	}

}
