package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//input[@id='input-firstname']")
WebElement txtFitrstname;

@FindBy(xpath="//input[@id='input-lastname']")
WebElement txtLastname;

@FindBy(xpath="//input[@id='input-email']")
WebElement txtEmail;

@FindBy(xpath="//input[@id='input-telephone']")
WebElement txtTelephone;

@FindBy(xpath="//input[@id='input-password']")
WebElement txtPassword;

@FindBy(xpath="//input[@id='input-confirm']")
WebElement txtPasswordConfirm;

@FindBy(xpath="//input[@name='agree']")
WebElement chkbPolicy ;

@FindBy(xpath="//input[@value='Continue']")
WebElement btnContinue;

@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
WebElement msgConfirmation;

public void setFirstName(String fname)
{
	txtFitrstname.sendKeys(fname);
}

public void setLastName(String lname)
{
	txtLastname.sendKeys(lname);
}

public void setEmail(String email)
{
	txtEmail.sendKeys(email);
}
public void setTelephone(String tel)
{
	txtTelephone.sendKeys(tel);
}

public void setPassword(String pwd)
{
	txtPassword.sendKeys(pwd);
}
public void setConfirmPassword(String pwd)
{
	txtPasswordConfirm.sendKeys(pwd);
}
public void setprivacyPolicy()
{
	chkbPolicy.click();
}

public void ContinueButton()
{
	btnContinue.click();
}

public String getConfirmMessage(){

try {
	return (msgConfirmation.getText());
	
  }catch (Exception e) {
return(e.getMessage());}
	
}
}
