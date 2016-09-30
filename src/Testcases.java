import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;



public class Testcases {

	@Test
	@Ignore
	public void test() {
		//fail("Not yet implemented");
	}
	
	
	@Test
	public void testSomeStrings(){
		String message = new String("Hello,world!");
		
		String message2 = "Hello,world!";
		String message3 = "Hello,world!";
		
		Assert.assertSame(message2, message3);
	}

}
