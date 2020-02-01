package com.test.base;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class LoginPage {
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "/Users/sruthijayaraj/eclipse-workspace/chromedriver");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
  }

}
