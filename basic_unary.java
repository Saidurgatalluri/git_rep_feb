package arraydemo;

public class basic_unary {
	public static void main(String[] args) {
		int a = 12;
		int b = 12;
		System.out.println(a++);
		System.out.println(a);
		int r = a++ + ++a;
//System.out.println(a);
		System.out.println(r);
		System.out.println(a);

		String s = new String("6");
		System.out.println(1 + 10 + s + 1 + 10);
	}
}
