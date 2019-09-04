/**
 * 
 */
package Calculate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import junit.framework.Assert;

/**
 * @author Mitali
 *
 */
public class StringcalculatorTest {
	
	StringCalculator d=new StringCalculator();
	
	@Test
	public final void whenEmptyStringIsUsedThenReturnValueIsZero() {
	    assertEquals(0,StringCalculator.emptystringthemethodwillreturn0(""));
	}
	 @Test
	    public final void methodcantake01or2numbersseparatedbycommaTest() {
	        StringCalculator.methodcantake01or2numbersseparatedbycomma("1,2,3");
	        assertTrue(true);
	    }
	 @Test
	 public final void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
	    assertEquals(3, StringCalculator.Methodwilreturntheirsumofnumbers("3"));
	 }

	 @Test
	 public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
	    assertEquals(3+6, StringCalculator.Methodwilreturntheirsumofnumbers("3,6"));
	 }
	   
	    
	    
	    @Test
	    public final void AllowtheAddmethodtohandleanunknownamountofnumbersTest() {
	        Assert.assertEquals(3+6+15+18+46+33, StringCalculator.AllowtheAddmethodtohandleanunknownamountofnumbers("3,6,15,18,46,33"));
	    }
	    @Test
	    public final void whenNewLineIsUsedBetweenNumbersThenReturnTheirSums() {
	        Assert.assertEquals(3+6+15, StringCalculator.tohandlenewlinebetweennumbers("3,6n15"));
	    }
	    
	   /* @Test
	    public final void whenDelimiterIsSpecifiedThenItIsUsedToSeparateNumbers() {
	        Assert.assertEquals(3+6+15, Demo2.add1("//;\n1;2"));
	    }*/
	    
	   
	    
	    @Rule
	    public ExpectedException exception = ExpectedException.none();

	
	    @Test
	    public final void whenNegativeNumbersAreUsedThenRuntimeExceptionIsThrown() {
	    	
	        RuntimeException exception = null;
	        try {
	            StringCalculator.whenNegativeNumbersAreUsedThenRuntimeExceptionIsThrown("8,-4,19,-18,17,327");
	        } catch (RuntimeException e) {
	            exception = e;
	        }
	        
	        Assert.assertNotNull(exception);
	        Assert.assertEquals("negative numbers are not allowed [-4, -18]", exception.getMessage());
	    }
	    
	    @Test
	    public final void whenDelimiterIsSpecifiedThenItIsUsedToSeparateNumbers() {
	        Assert.assertEquals(3+6+15, StringCalculator.Supportdifferentdelimiters("//;n3;6;15"));
	    }
	    
	    @Test
	    public final void whenOneOrMoreNumbersAreGreaterThan1000IsUsedThenItIsNotIncludedInSum() {
	        Assert.assertEquals(3+100+6, StringCalculator.Numbersbiggertha1000shouldbeignored("3,100,10001,6,1234"));
	    }
}



