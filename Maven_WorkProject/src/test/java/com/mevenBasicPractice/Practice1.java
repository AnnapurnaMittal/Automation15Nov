package com.mevenBasicPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectrepository.LoginPageDemo;

public class Practice1 {

	@Test
	public void loginTest()
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
		LoginPageDemo login = new LoginPageDemo(driver);//all webelement gets initialised
		/*login.getUntbx().sendKeys("admin");
		login.getPwtbx().sendKeys("admin");
		login.getLgbtn().click();*/
		login.setLogin("admin", "admin");//-->page refresh-->address changed----Here action is performed ,so
		//here webelement gets initialised.
		login.setLogin("admin1", "manager1");// we are trying to perform by using old address--but element is 
		//no longer attached.
					
	}
}

//so in this we get stale element reference exception