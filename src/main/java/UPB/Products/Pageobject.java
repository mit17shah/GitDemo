package UPB.Products;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pageobject {
	
	public WebDriver driver;
	public Pageobject(WebDriver driver)
	{
		this.driver=driver;
	}

	By Touch=By.xpath("//*[@id='menu-item-2353']/a");
	By Fname=By.xpath("//*[@id='wpcf7-f179-p15-o1']/form/p[2]/span/input");
	By Cname=By.xpath("//*[@id='wpcf7-f179-p15-o1']/form/p[3]/span/input");
	By Title=By.xpath("//*[@id='wpcf7-f179-p15-o1']/form/h2");
	By Email=By.xpath("//*[@id='wpcf7-f179-p15-o1']/form/p[4]/span/input");
	By Message=By.xpath("//*[@id='wpcf7-f179-p15-o1']/form/p[5]/span/textarea");
	
	
	
	
	public WebElement getTouch()
	{
		return driver.findElement(Touch);
	}
	public WebElement getFname()
	{
		return driver.findElement(Fname);
	}
	public WebElement getCname()
	{
		return driver.findElement(Cname);
	}
	public WebElement getTitle()
	{
		return driver.findElement(Title);
	}
	public WebElement getemail()
	{
		return driver.findElement(Email);
	}
	public WebElement getMessage()
	{
		return driver.findElement(Message);
	}
	
	
	
	
	
	
}
