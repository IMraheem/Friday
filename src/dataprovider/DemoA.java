package dataprovider;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoA
{
	@DataProvider
	public String[][] /*Object[][]*/ getData()
	{
		//Object[][] data=new Object[][];
		//now we can store different types of object also
		
		String[][] data=new String[2][3];
		
		data[0][0]="UserA";
		data[0][1]="A123";
		data[0][2]="A123";
		
		data[1][0]="UserB";
		data[1][1]="B123";
		data[1][2]="B123";
		
		return data;
	}
	
	@Test(dataProvider="getData")
	public void createUser(String un, String pw, String cpw)
	{
		Reporter.log(un+" "+pw+" "+cpw, true);
	}

}
