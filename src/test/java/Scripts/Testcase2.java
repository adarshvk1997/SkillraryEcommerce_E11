package Scripts;

import org.testng.annotations.Test;

import POM.DemoSkillraryPage;
import POM.DownloadInvoicePage;
import POM.SkillraryHomePage;
import generic_library.BaseClass;

public class Testcase2 extends BaseClass {
	@Test
	public void tc2() {
		SkillraryHomePage s = new SkillraryHomePage(driver);
		s.gearsButton();//business libary of gears from SkillraryHomePage
		s.skillraryDemoApp();//business libary of skillraryDemoApp from SkillraryHomePage
		utilities.childBrowser(driver);
		DemoSkillraryPage ds=new DemoSkillraryPage(driver);
		ds.feedBckbtn();//business libary of feedBckbtn from DemoSkillrarypage
		DownloadInvoicePage dI=new DownloadInvoicePage(driver);
		dI.downloadInvoiceButton();//business libary of downloadInvoiceButton from downloadInvoicepage
	}

}
