package Baseclass;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomClasses.FacebookHome;
import PomClasses.FacebookLogin;

public class Testclass extends FacebookBase{
	FacebookLogin login;
	FacebookHome home;
	@BeforeClass
	public void openBrowser() {
		initializeBrowser();
		login=new FacebookLogin(driver);
		home=new FacebookHome(driver);
	}
	@BeforeMethod
	public void loginToApp() throws Throwable {
		login.enterUn(FaceUtility.getTd(0, 0));
		login.enterPwd(FaceUtility.getTd(1, 0));
		login.clickLoginBtn();
	}
	@Test
	public void verifyName() throws Throwable  {
		Reporter.log("Verify name",true);
		String actName=home.verifyName();
		String expName=FaceUtility.getTd(2, 0);
		Assert.assertEquals(actName,expName,"Both are not same,Tc is fail");
	}
	@AfterMethod
public void logoutApp() {
	Reporter.log("Logout application",true);	
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("Close browser",true);
		Reporter.log("Ok",true);
	}


}
