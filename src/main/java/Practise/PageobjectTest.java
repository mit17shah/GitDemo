package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageobjectTest {
	
	
	public static WebDriver driver;
	public PageobjectTest(WebDriver driver) 
	{
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	
	By Email = By.xpath("//*[@id='email']");
	By Password = By.xpath("//*[@id='pass']");
	//By Login = By.xpath("//*[@type='submit']");
	By Tital = By.xpath("//*[@class='mbl _3m9 _6o _6s _mf']");
	By First = By.xpath("//*[@name='firstname']");
	By Last = By.xpath("//*[@name='lastname']");
	
	
	
	
	
	public WebElement login()
	{
		return driver.findElement(Email);
	}
	public WebElement Passw()
	{
		return driver.findElement(Password);
	}
	/*public WebElement sub()
	{
		return driver.findElement(Login);
	}*/
	public WebElement getTitle()
	{
		return driver.findElement(Tital);
	}
	public WebElement Firstuser()
	{
		return driver.findElement(First);
	}
	public WebElement Lastuser()
	{
		return driver.findElement(Last);
	}
}
