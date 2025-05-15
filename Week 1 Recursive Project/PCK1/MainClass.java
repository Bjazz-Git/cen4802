package PCK1;

public class MainClass {

	public static void main(String[] args) {
		//Indicates the sequence of the value in the Fibonacci sequence
		int fibonacciTerm = 10;
		//F0 of the Fibonacci sequence
		int previousValue = 0;
		//F1 of the Fibonacci sequence
		int currentValue = 1;
		//holds the value returned from running the Fibonacci sequence a desired amount of times
		int finalValue;
		
		finalValue = getFibonacciTerm(fibonacciTerm, currentValue, previousValue);
		
		if(fibonacciTerm == 1) {
			System.out.printf("The %dst term of the Fibonacci sequence is %d", fibonacciTerm, finalValue);
		}
		else if(fibonacciTerm == 2) {
			System.out.printf("The %dnd term of the Fibonacci sequence is %d", fibonacciTerm, finalValue);
		}
		else if(fibonacciTerm == 3) {
			System.out.printf("The %drd term of the Fibonacci sequence is %d", fibonacciTerm, finalValue);
		}
		else {
			System.out.printf("The %dth term of the Fibonacci sequence is %d", fibonacciTerm, finalValue);
		}
	}
	
	//Recursive method that returns a specific Fibonacci sequence value
	public static int getFibonacciTerm(int n, int currentValue, int previousValue) {
		int nextValue = previousValue;
		//Starts as 1 to represent F1
		int finalValue = 1;
		
		//Recursively calls itself and inserts new arguments
		if(n - 1 > 0) {
			//Adds the previous value in the fibonacci sequence to the current value to get the next value in the sequence
			nextValue = currentValue + previousValue;
			finalValue = getFibonacciTerm(n-1, nextValue, currentValue);
		}
		
		//is only called if n (sequence number) is 0
		else if(n == 0) {
			finalValue = 0;
		}
		
		else {
			finalValue = currentValue;
		}
		
		return finalValue;
		
	}
}