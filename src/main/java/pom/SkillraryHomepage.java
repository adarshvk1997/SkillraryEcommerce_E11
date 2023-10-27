package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomepage {
	// declaration
	//address of gears
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	//address of skillrary demo app
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	//address of search text field
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchTf;
	
	//address of search icon
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchIcon;
	
	//initialization
	public  SkillraryHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//utilization

	public WebElement getGearsbtn() {
		return gearsbtn;
	}

	public void setGearsbtn(WebElement gearsbtn) {
		this.gearsbtn = gearsbtn;
	}

	public WebElement getSkillrarydemoapp() {
		return skillrarydemoapp;
	}

	public void setSkillrarydemoapp(WebElement skillrarydemoapp) {
		this.skillrarydemoapp = skillrarydemoapp;
	}

	public WebElement getSearchTf() {
		return searchTf;
	}
	public WebElement getSearchIcon()
	{
		return searchIcon;
	}
	//buisness libraries
	public void skillraryDemoApp()
	{
		skillrarydemoapp.click();
	}
	public void searchTextField(String data)
	{
		searchTf.sendKeys(data);
	}

	
	
	

}
