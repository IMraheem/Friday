package invocations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class B extends BaseTest
{
	@Test
	public void testB()
	{
		Reporter.log("TestB", true);
	}

}
