package Facebook;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Practise.BaseTest;
import Practise.PageobjectTest;

public class HomepageTest extends BaseTest{
	
	
	@BeforeTest
	public void open() throws IOException
	{
		driver =Basefile();
		driver.get(Prop.getProperty("url"));
	}
	
	@Test
	public void Login() throws IOException
	{
		
		PageobjectTest po=new PageobjectTest(driver);
		po.login().sendKeys("Username");
		po.Passw().sendKeys("Password");
		Assert.assertEquals(po.getTitle().getText(), "It’s quick and easy.");
		
	}
		@AfterTest
		public void close()
		{
			driver.close();
			driver=null;
		}
			
		
		
	}
	

