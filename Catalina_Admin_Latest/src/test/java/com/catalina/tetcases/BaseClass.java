package com.catalina.tetcases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.utils.FileUtil;
import com.catalina.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	

	public String baseurl = readconfig.getApplicationURL();
	public String username = readconfig.getusername();
	public String password = readconfig.getpassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		
		
		logger = org.apache.log4j.Logger.getLogger("PayPerFix_ProjectOwnercatalina");
		PropertyConfigurator.configure("log4j.properties");
		
		
		if(br.equalsIgnoreCase("chrome"))
		{			
		System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getfirefoxpath());
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if(br.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver",readconfig.getiepath());
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		
		driver.get(baseurl);
	}
	
	
	@AfterClass
	public void terdown()
	{
		driver.quit();
	}
	
	
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	

	 
	//create random string
	public String randomstring()
	{
		String generatorstring = RandomStringUtils.randomAlphabetic(10);
		return(generatorstring);
	}
	//String email = randomstring()+"@gmail.com";
	
	//create random number
	public String randomNum()
	{
		String generatorstring2 = RandomStringUtils.randomNumeric(10);
		return(generatorstring2);
	}
	
}
