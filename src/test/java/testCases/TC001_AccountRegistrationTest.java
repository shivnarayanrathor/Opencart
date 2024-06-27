package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;



public class TC001_AccountRegistrationTest extends BaseClass{
	
	@Test(groups={"Regression","Master"})
	public void verify_account_registration()
	{
		logger.info("**** Starting TC001_AccountRegistrationTest ****");
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on Myaccount Link ");
		hp.clickRegister();
		
		logger.info("Clicked on Register Link");
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		
		logger.info("Providing customer details...");
		
		regpage.setFirstName(randomeString().toUpperCase());
		regpage.setLastName(randomeString().toUpperCase());
		regpage.setEmail(randomeString()+"@gmail.com");// rendom genreated the email
		regpage.setTelephone(randomeNumber());
		
		String password= randomeAlphaNumberic(); 
		
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		regpage.setprivacyPolicy();
		regpage.ContinueButton();
		logger.info("Validiting expected message..");
	String confmsg=regpage.getConfirmMessage();
	
	if(confmsg.equals("Your Account Has Been Created!"))
	{
		Assert.assertTrue(true);
	}
	else
	{
		 logger.error("Test failed...");
    	 logger.debug("Debug logs..");
		Assert.assertTrue(false);
	}
	//Assert.assertEquals(confmsg, "Your Account Has Been Created!!!");	
		
	}

     catch(Exception e)
		{
    	 
    	 Assert.fail();
		}
		logger.info("**** Finished TC001_AccountRegistrationTest ****");
		}
}
