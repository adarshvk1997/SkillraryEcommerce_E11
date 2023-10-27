package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryPage {
	// Declaration
		// address of select catagory
		@FindBy(name ="addresstype")
		private WebElement selectDd;
		
		// address of feedback
		@FindBy(xpath ="//a[text()='FEEDBACK']")
		private WebElement feedBckbtn;
		
		// initialization
		public DemoSkillraryPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		//utilization

		public WebElement getSelectDd() {
			return selectDd;
		}

		
		public WebElement getFeedBckbtn() {
			return feedBckbtn;
		}
//Business library
		public void feedBckbtn() {
			feedBckbtn.click();
		}
		
		
		
}
