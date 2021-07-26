package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.Screenshot;

public class AutomationPracticeLogin {
	
	public void getLogin() {
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(BaseConfig.getConfigValue("URL"));
		
		MasterPageFactory obj = new MasterPageFactory(driver);
		Highlighter.addColor(driver,obj.getSigninbtn());
		Screenshot.getScreenShot(driver, "Home Page");
		obj.getSigninbtn().click();
		
		Highlighter.addColor(driver, obj.getEmail());
		obj.getEmail().sendKeys(BaseConfig.getConfigValue("user"));
		
		Highlighter.addColor(driver, obj.getPassword());
		obj.getPassword().sendKeys(BaseConfig.getConfigValue("password"));
		
		Screenshot.getScreenShot(driver, "Login Page");
		
		obj.getSigninbtn2().click();
				
	}

}
