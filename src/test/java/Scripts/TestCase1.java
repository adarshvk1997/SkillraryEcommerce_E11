package Scripts;



import org.testng.annotations.Test;

import generic_library.BaseClass;
import generic_library.WebdriverUtilities;
import pom.SkillraryHomepage;
import pom.DemoSkillraryPage;
import pom.TestingPage;
import generic_library.BaseClass;

public class TestCase1 extends BaseClass {
	@Test
	
public void tc1() throws Throwable
{
		SkillraryHomepage s=new SkillraryHomepage(driver);
		s.getGearsbtn();
		WebdriverUtilities.childBrowser(driver);
		DemoSkillraryPage ds=new DemoSkillraryPage(driver);
		WebdriverUtilities.dropDown(ds.getSelectDd(),pdata.getPropertydata("coursedd"));
		TestingPage t=new TestingPage(driver);
		WebdriverUtilities.Scrolling(driver,t.getFacebook());
		Thread.sleep(3000);
		t.FacebookWebElement();
		
		
	
}
}
