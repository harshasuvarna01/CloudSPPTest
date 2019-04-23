package com.example.basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class login 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.differencebetween.net/technology/difference-between-cvs-and-svn/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.close();
	}
}
