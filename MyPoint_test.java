package eddu.smg;

public class MyPoint_test {

	public static void main(String[] args) {
		MyPoint a1 = new MyPoint();
		MyPoint a2 = new MyPoint(5,6);
		System.out.println(a1.getX());
		System.out.println(a2.getY());
		System.out.println(a1.distance(1, 7));
		System.out.println(a2.distance(a1));
		System.out.println(MyPoint.distance(a1, a2));
	}

}
