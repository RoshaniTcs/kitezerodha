package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin {
	@FindBy(xpath="//input[@id='email']")private WebElement UN;
	@FindBy(xpath="//input[@id='pass']")private WebElement Pwd;
	@FindBy(xpath="//button[@name='login']")private WebElement loginbtn;
	
	public FacebookLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void enterUn(String username) {
		UN.sendKeys(username);
	}
	public void enterPwd(String password) {
		Pwd.sendKeys(password);
	}
	public void clickLoginBtn() {
		loginbtn.click();
	}

}
