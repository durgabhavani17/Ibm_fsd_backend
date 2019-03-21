
public class Swap {

	public static void main(String[] args) {
		int a=10;
		int b=30;
		System.out.println("before swap a is"+a+ "b is"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap a is"+a+ "b is"+b);

	}

}
