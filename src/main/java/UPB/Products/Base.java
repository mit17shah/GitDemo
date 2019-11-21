package UPB.Products;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public WebDriver driver;
	public Properties prop;
	public WebDriver Basefile() throws IOException
	{
		prop=new Properties();
		FileInputStream file=new FileInputStream((System.getProperty("user.dir")+"\\src\\main\\java\\UPB\\Products\\Base.Properties"));
		prop.load(file);
		String Sitename=prop.getProperty("Browser");
		//String Sitename=System.getProperty("Browser");
		if(Sitename.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir")+"\\src\\main\\java\\UPB\\Products\\chromedriver_win32\\chromedriver.exe" ));
			ChromeOptions Option=new ChromeOptions();
			if(Sitename.contains("headless"))
			{
				Option.addArguments("headless");
			}
			driver=new ChromeDriver(Option);
		}
		else if(Sitename.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		return driver;
		
		
	}
	
	
	 
}
