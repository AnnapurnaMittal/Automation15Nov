package com.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageDemo 
{


		private WebElement untbx;
		private WebElement pwtbx;
		private WebElement lgbtn;
		
		public LoginPageDemo(WebDriver driver) {
			untbx = driver.findElement(By.name("user_name"));
			pwtbx = driver.findElement(By.name("user_password"));
			lgbtn = driver.findElement(By.id("submitButton"));
		}

		public WebElement getUntbx() {
			return untbx;
		}

		public WebElement getPwtbx() {
			return pwtbx;
		}

		public WebElement getLgbtn() {
			return lgbtn;
		}
		
		public void setUntbx(WebElement untbx) {
			this.untbx = untbx;
		}

		public void setPwtbx(WebElement pwtbx) {
			this.pwtbx = pwtbx;
		}

		public void setLgbtn(WebElement lgbtn) {
			this.lgbtn = lgbtn;
		}
		
		
		//business logic
		public void setLogin(String un, String pass)
		{
			untbx.sendKeys(un);
			pwtbx.sendKeys(pass);
			lgbtn.click();
		}
		
		
	}

