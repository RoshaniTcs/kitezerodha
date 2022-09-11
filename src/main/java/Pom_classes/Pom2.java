package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2 {
	@FindBy(xpath = "//input[@id='pin']")private WebElement PIN;
	@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement CtnBtn;
	
	public Pom2(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void enterPIN(String Pin) {
		PIN.sendKeys(Pin);
	}
	public void clickCtnBtn() {
		CtnBtn.click();
	}

}
