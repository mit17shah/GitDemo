package UPB.Products;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Emailpage extends Base{

	Pageobject po;
	
	@BeforeTest
	public void before() throws IOException
	{
		driver=Basefile();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void Email() throws IOException
	{
		
		po=new Pageobject(driver);
		po.getTouch().click();
		po.getemail().sendKeys("Mitesh.com");
		po.getMessage().sendKeys("i am sending message");
	}
	
	
	@AfterTest
	public void after()
	{
		driver.close();
		driver=null;
	}
}
