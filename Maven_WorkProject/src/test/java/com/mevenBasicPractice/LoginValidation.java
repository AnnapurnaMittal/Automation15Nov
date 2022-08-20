package com.mevenBasicPractice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectrepository.LoginPage;
import com.objectrepository.LoginPageDemo;

public class LoginValidation {
	
	@Test
	public void loginTest()
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
		LoginPage login = new LoginPage(driver);//not get initialised
		login.setLogin("admin", "admin");					
	}
}
