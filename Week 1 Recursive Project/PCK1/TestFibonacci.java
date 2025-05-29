package PCK1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class TestFibonacci {
    //Used to test specific fibonacci sequence
    int fibonacciSequence = 10;
	int previousValue = 0;
	int currentValue = 1;
	int finalValue;
    //Only 0-10 terms of the fibonacci sequence
    int[] fibonacciTerms = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
    int expectedValue = fibonacciTerms[fibonacciSequence];
 
    @Test
    //Checks that getFibonacciTerm will returns the correct fibonacci sequence value based on the sequence number entered (This test only works for sequences 0 - 10)
    public void checkFibonacciSequenceReturnValue(){
		finalValue = MainClass.getFibonacciTerm(fibonacciSequence, currentValue, previousValue);

        assertEquals(finalValue, expectedValue) ;
    }

     @Test
    //Loops through all fibonacci sequences (based on the ones in fibonacciTerms array) and sees if getFibonacciTerm returns the correct values
    public void checkAllFibonacciSequenceReturnValues(){
        for(int i = 0; i < fibonacciTerms.length; i++){
		    finalValue = MainClass.getFibonacciTerm(i, currentValue, previousValue);
            assertEquals(finalValue, fibonacciTerms[i]) ;
        }
    }

    
    @Test
    //Checks if printFibonacciSequence returns a non-blank string
    public void fibonacciPrintReturnsString(){
        for(int i = 0; i < 4; i++){
            String fibonacciPrint = MainClass.printFibonacciSequence(i, fibonacciTerms[i]);
            assertTrue(fibonacciPrint != "");
        }
    
    }

    
    @Test
    //Checks if printFibonacciSequence returns a string with the proper string formatting (1st, 2nd, 3rd, nth)
    public void fibonacciPrintReturnsCorrectString(){
        String fibonacciPrint = MainClass.printFibonacciSequence(fibonacciSequence, expectedValue);
        if(fibonacciSequence == 1){
            assertTrue(fibonacciPrint.contains("1st"));
        }
        else if(fibonacciSequence == 2){
            assertTrue(fibonacciPrint.contains("2nd"));
        }
        else if(fibonacciSequence == 3){
            assertTrue(fibonacciPrint.contains("3rd"));
        }
        else{
            assertTrue(fibonacciPrint.contains(fibonacciSequence + "th"));
        }
        
    }
}
