
public class WrapperClass {

	public static void main(String[] args) {
		Integer num1 = new Integer(29);
		Integer iObj = 10; // auto boxing
//		iObj++;
//		System.out.println(iObj);
		
		int num = iObj; // auto unboxing
		
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		
//		System.out.println(num1.intValue());
//		System.out.println(num1.doubleValue());
//		
//		Double num2 = new Double(3.14);
//		System.out.println(num2.intValue());
//		System.out.println(num2.doubleValue());
		
		Integer n1 = Integer.valueOf(5);
		Integer n2 = Integer.valueOf(1024);
		
		System.out.println(Integer.max(n1, n2));
		System.out.println(Integer.min(n1, n2));
		System.out.println(Integer.sum(n1, n2));

		System.out.println(Integer.toBinaryString(12));
		System.out.println(Integer.toOctalString(12));
		System.out.println(Integer.toHexString(12));
	}

}
