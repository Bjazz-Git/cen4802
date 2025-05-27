package PCK1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.*;
import org.junit.runners.Parameterized.BeforeParam;

public class TestFibonacci {
    int fibonacciTerm = 10;
	int previousValue = 0;
	int currentValue = 1;
	int finalValue;
    int expectedValue = 55;
 
    @Test
    public void testFibonacciSequenceValue(){
		
		finalValue = MainClass.getFibonacciTerm(fibonacciTerm, currentValue, previousValue);
        assertEquals(finalValue, expectedValue);
    }

    
    @After
    public void testFibonacciSequencePrint(){
        String fibonacciPrint = MainClass.printFibonacciSequence(fibonacciTerm, finalValue);
        assertTrue( fibonacciPrint != "");
    }
}
