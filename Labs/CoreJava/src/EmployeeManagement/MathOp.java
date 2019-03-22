package EmployeeManagement;



import java.util.function.BiFunction;
import java.util.function.Consumer;

public class MathOp {
	public static void main(String[] args) {
		MathOp m = new MathOp();
		BiFunction<Integer, Integer, Integer> addition = (a, b) -> a + b;
		BiFunction<Integer, Integer, Integer> subtraction = (a, b) -> a - b;
		BiFunction<Integer, Integer, Integer> multiplication = (a, b) -> a * b;
		BiFunction<Integer, Integer, Integer> division = (a, b) -> a / b;

		System.out.println("10 + 5 = " + m.operate(10, 5, addition));

		System.out.println("10 - 5 = " + m.operate(10, 5, subtraction));

		System.out.println("10 x 5 = " + m.operate(10, 5, multiplication));

		System.out.println("10 / 5 = " + m.operate(10, 5, division));

		// without parenthesis and using Consumer functional interface
		

		Consumer<String> greetService1 = message ->

		System.out.println("Hello " + message);

		// with parenthesis and using custom functional interface

		GreetingService greetService2 = (message) ->

		System.out.println("Hello " + message);

		greetService1.accept("Mahesh");

		greetService2.sayMessage("Suresh");

	}

	interface MathOperation {

		int operation(int a, int b);

	}

	interface GreetingService {

		void sayMessage(String message);

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })

	private int operate(int a, int b, BiFunction mathOperation) {

		return (int) mathOperation.apply(a,b);

	}
}
