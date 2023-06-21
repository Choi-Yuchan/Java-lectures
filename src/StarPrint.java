
public class StarPrint {
	
	void printTriangle(int num) {
		
	        for (int i = 0; i < num; i++) {
	            for (int j = 0; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	    }
	}
	
	void printReverseTriangle(int num){
	        for (int i = 0; i < num; i++) {
	            for (int j = 0; j <= num - i - 1; j++) {
	                System.out.print("*");
	            }
	            for (int k = 0; k <= i; k++) {
	                System.out.print(" ");
	            }
	            System.out.println();
	        }
	    }
}

