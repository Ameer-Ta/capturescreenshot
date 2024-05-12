package com.capturescreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class capturescreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thasleem\\Dropbox\\PC\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com");
	      driver.manage().window().maximize();
//File scr=driver.getScreenshotAs(OutputType.FILE);
//File trg=new File("C:\\Users\\thasleem\\Pictures\\Saved Pictures\\homepage.png");
//FileUtils.copyFile( scr,trg);
TakesScreenshot ts =(TakesScreenshot)driver;
File src = ts.getScreenshotAs(OutputType.FILE);
File des = new File("C:\\Users\\thasleem\\Pictures\\Saved Pictures\\homepage.png");
FileHandler.copy(src, des);
	}

}
