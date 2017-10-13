package groups;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class User extends BaseTest
{
	@Test(groups= {"smoke"})
	public void createUser()
	{
		Reporter.log("createUser", true);
	}
	
	@Test(groups= {"user"})
	public void editUser()
	{
		Reporter.log("editUser", true);
	}
	
	@Test(groups= {"user"})
	public void removeUser()
	{
		Reporter.log("removeUser", true);
	}

}
