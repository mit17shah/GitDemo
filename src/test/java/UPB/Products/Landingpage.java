package UPB.Products;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Landingpage extends Base{

	public Pageobject po;
	
	
	@BeforeTest
	public void Before() throws IOException
	{
		driver=Basefile();
		driver.get(prop.getProperty("url"));
	}
	@Test(dataProvider="getData")
	public void Login(String Username , String Password) throws IOException
	{
		
		po=new Pageobject(driver);
		po.getTouch().click();
		po.getFname().sendKeys(Username);
		po.getCname().sendKeys(Password);
		Assert.assertEquals(po.getTitle().getText(), "Brochure Request Form");
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="firstuser";
		data[0][1]="firstpassword";
		data[1][0]="seconduser";
		data[1][1]="secondpassword";
		
		return data;
		
	}

	@AfterTest
	public void After()
	{
		driver.close();
		driver=null;
	}
}
