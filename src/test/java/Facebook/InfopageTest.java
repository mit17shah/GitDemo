package Facebook;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Practise.BaseTest;
import Practise.PageobjectTest;

public class InfopageTest extends BaseTest{
	
	@BeforeTest
	public void open() throws IOException
	{
		driver =Basefile();
		driver.get(Prop.getProperty("url"));
	}

	
	@Test
	public void Info() throws IOException
	{
		
		PageobjectTest po=new PageobjectTest(driver);
		po.Firstuser().sendKeys("Mitesh");
		po.Lastuser().sendKeys("Shah");
		
	}
	@AfterTest
	public void close()
	{
		driver.close();
		driver=null;
	}
}
