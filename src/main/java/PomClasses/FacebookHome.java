package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookHome {
	@FindBy(xpath="//span[text()='Roshani Poharkar']")private WebElement Name;
	
	public FacebookHome(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public String verifyName() {
	String actName=Name.getText();
	return actName;
	}

}
