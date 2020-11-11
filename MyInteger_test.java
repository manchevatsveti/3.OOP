package eddu.smg;

public class MyInteger_test {

	public static void main(String[] args) {
		MyInteger v = new MyInteger(34);
		MyInteger v2 = new MyInteger(37);
		char[] arr = {'1','4','5'};
		System.out.println(v.getValue());
		System.out.println(MyInteger.isEven(11));
		System.out.println(v.isOdd());
		System.out.println(MyInteger.isPrime(v2));
		System.out.println(v.equals(34));
		System.out.println(v.equals(v2));
		System.out.println(MyInteger.parseInt(arr));
		System.out.println(MyInteger.parseInt("200"));

	}

}
