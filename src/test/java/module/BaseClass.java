package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {

	public WebDriver driver;
	public static final String URL = "https://www.wikipedia.org/";
	
	@BeforeMethod
	public void beforeTest(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void test1(){
		driver.get(URL);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test
	public void test2(){
		driver.get(URL);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test
	public void test3(){
		driver.get(URL);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	
	@AfterMethod
	public void afterTest(){
		driver.quit();
	}

	}


