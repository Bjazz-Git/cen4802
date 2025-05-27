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
		System.out.println(printFibonacciSequence(fibonacciTerm, finalValue));
		
	}
	
	/** Recursive method that returns a specific value based on the Fibonacci sequence given by the argument.
	 * 
	 * @param n the number of fibonacci sequences that will happen and the value that dictates which fibonacci sequence value will be returned
	 * @param currentValue represents the most recent Fibonacci sequence value. 
	 * This value is summed with {@code previousValue} to get the next Fibonacci sequence value.
	 * @param previousValue represents fibonacci sequence value before the most recent Fibonacci sequence value. 
	 * This value is summed with {@code currentValue} to get the next Fibonacci sequence value.
	 * @return an integer value, this value represents the Fibonacci value yielded from the specific Fibonacci sequence.
	 */
	public static int getFibonacciTerm(int n, int currentValue, int previousValue) {
		int nextValue = previousValue;
		//Starts as 1 to represent F1 in Fibonacci sequence
		int finalValue = 1;
		
		//Recursively calls itself and inserts new arguments
		if(n - 1 > 0) {
			//Adds the previous value in the Fibonacci sequence to the current value to get the next value in the sequence
			nextValue = currentValue + previousValue;
			finalValue = getFibonacciTerm(n-1, nextValue, currentValue);
		}
		
		//is only called if n (sequence number) is 0
		else if(n == 0) {
			finalValue = 0;
		}
		
		//Used to set finalValue to the last fibonacci sequence value
		else {
			finalValue = currentValue;
		}
		
		//Returns the Fibonacci sequence alue
		return finalValue;
	}

	public static String printFibonacciSequence(int fibonacciTerm, int finalValue){
		String fibonacciString = "";

		if(fibonacciTerm == 1) {
			fibonacciString = String.format("The %dst term of the Fibonacci sequence is %d", fibonacciTerm, finalValue);
		}
		else if(fibonacciTerm == 2) {
			fibonacciString = String.format("The %dnd term of the Fibonacci sequence is %d", fibonacciTerm, finalValue);
		}
		else if(fibonacciTerm == 3) {
			fibonacciString = String.format("The %drd term of the Fibonacci sequence is %d", fibonacciTerm, finalValue);
		}
		else {
			fibonacciString = String.format("The %dth term of the Fibonacci sequence is %d", fibonacciTerm, finalValue);
		}

		return fibonacciString;
	}
}