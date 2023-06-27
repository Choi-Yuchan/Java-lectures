


public class Lotto {

	public static void main(String[] args) {
		int num = 0;
		int[] lotto = new int[6];
		
		
		
		for(int i = 1; i <= lotto.length; i++) {
			lotto[i] = (int) Math.random() * 45;
			
			if(lotto[i] == lotto[i-1]) {
				i--;
				break;
			}
			
			System.out.println(lotto[i]);
			
		}
		
	}

}
