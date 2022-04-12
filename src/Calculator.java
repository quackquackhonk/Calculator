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
		System.out.println("You picked: " + operation);
		
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
}


