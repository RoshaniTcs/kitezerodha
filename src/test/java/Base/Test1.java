package Base;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pom_classes.Pom1;
import Pom_classes.Pom2;
import Pom_classes.Pom3;

public class Test1 extends RoshaniBase{
	Pom1 login1;
	Pom2 login2;
	Pom3 home;
	@BeforeClass
	public void openBrowser() throws Throwable{
		initializeBrowser();
		login1=new Pom1(driver);
		login2=new Pom2(driver);
		home=new Pom3(driver);
		}
	@BeforeMethod
	public void loginToApp() throws Throwable  {
		login1.enterUN(Utility.getTD(0, 0));
		login1.enterPWD(Utility.getTD(0, 1));
		login1.clickLOGINBTN();
		login2.enterPIN(Utility.getTD(0, 2));
		login2.clickCtnBtn();
		}
	@Test
	public void verifyuserid() throws Throwable {
		Reporter.log("Running verifyuserid",true);
		String actId=home.verifyuserID();
		String expId=Utility.getTD(0, 0);
		Assert.assertEquals(actId,expId,"Both are not same, TC is fail");
	}
	@AfterMethod
	public void logoutApp() {
		Reporter.log("Running logout",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("Running browser close",true);
	}
	
	

}
