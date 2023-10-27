package Scripts;

import org.testng.annotations.Test;

import generic_library.BaseClass;
import generic_library.WebdriverUtilities;
import pom.DemoSkillraryPage;
import pom.SkillraryHomepage;

public class TestCase2 extends BaseClass {
	
	@Test
	
	public void tc2()
	{
		SkillraryHomepage s=new SkillraryHomepage(driver);
		s.getGearsbtn();
		WebdriverUtilities.childBrowser(driver);
		DemoSkillraryPage ds=new DemoSkillraryPage(driver);
		
		
	}
	

}
