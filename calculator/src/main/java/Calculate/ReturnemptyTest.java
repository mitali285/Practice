/**
 * 
 */
package Calculate;

import static org.junit.Assert.assertFalse;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Mitali
 *
 */

public class ReturnemptyTest {
	Returnempty d=new Returnempty();
	 @Test
	    public void anemptystringreturns0(){
	    	String result=d.empty(null);
	    	Assert.assertTrue(true);
	    }
	       
	
	}


