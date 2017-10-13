package invocations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A extends BaseTest
{
	@Test
	public void testA()
	{
		Reporter.log("TestA", true);
	}

}
