package groups;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Product extends BaseTest
{
	@Test(groups= {"smoke"})
	public void createProduct()
	{
		Reporter.log("createProduct", true);
	}
	
	@Test(groups= {"product"})
	public void editProduct()
	{
		Reporter.log("editProduct", true);
	}
	
	@Test(groups= {"product"}, enabled=false)
	public void removeProduct()
	{
		Reporter.log("removeProduct", true);
	}

}
