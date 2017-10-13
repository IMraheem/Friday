package groups;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Customer extends BaseTest
{
	@Test(groups={"smoke"})
	public void createCustomer()
	{
		Reporter.log("createCustomer", true);
	}
	
	@Test(groups= {"customer"})
	public void editCustomer()
	{
		Reporter.log("editCustomer", true);
	}
	
	@Test(groups= {"customer"})
	public void removeCustomer()
	{
		Reporter.log("removeCustomer", true);
	}

}
