package Practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BaseTest {
	
	public static WebDriver driver;
	public Properties Prop;
	public WebDriver Basefile() throws IOException
	{
		
		Prop=new Properties();
		FileInputStream File = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Practise\\Base.Property");
		Prop.load(File);
		
		if(Prop.getProperty("Browser").equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\chromedriver.exe" );
			driver = new ChromeDriver();
		}
		else if (Prop.getProperty("Browser").equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
		
	 
	}

	
	
}
