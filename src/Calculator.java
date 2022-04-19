import java.util.Scanner;


public class Calculator {
	
	public static void main(String[] args) {
		// Create an instance of our calculator class
		CalculatorState state = new CalculatorState();
		// Create a scanner used for reading user input
		// We give the constructor the argument "System.in" to let 
		// the object know we want to read from the console
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an operation (+, -, *, /)...");
		String operation = input.nextLine();
		System.out.println("Enter the first number...");
		int xx = input.nextInt();
		System.out.println("Enter the second number...");
		int yy = input.nextInt();
		Integer result = null;
		switch (operation) {
			case "+":
				result = state.add(xx, yy);
				break;
			case "-":
				result = state.subtract(xx, yy);
				break;
			case "*":
				result = state.multiply(xx, yy);
				break;
			case "/":
				result = state.divide(xx, yy);
				break;
			case "^":
			  result = state.raise(xx, yy);
			default:
				System.out.println("Unknown operation \"" + operation + "\"");
				break;
		}
		
		if (result != null) {
		  System.out.println("--> " + Integer.toString(result));
		}
		
	}
	
}

class CalculatorState {
	
	CalculatorState () {}
	
	public int add(int x, int y) {
		return x + y;
	}

	public int subtract(int x, int y) {
		return x - y;
	}

	public int multiply(int x, int y) {
		return x * y;
	}
	
	public int divide(int x, int y) {
		return x / y;
	}
	
	public int raise(int x, int y) {
	  return (int) Math.pow(x, y);
	}
}


