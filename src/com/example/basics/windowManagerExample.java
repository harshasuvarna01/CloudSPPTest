package com.example.basics;


import org.openqa.selenium.chrome.ChromeDriver;

public class windowManagerExample 
{

	public static void main(String[] args) throws InterruptedException 
	{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			ChromeDriver driver =  new ChromeDriver();
			
			driver.get("https://www.google.com/");
			
			//set size of window
			org.openqa.selenium.Dimension d = new org.openqa.selenium.Dimension(500, 1000);
			driver.manage().window().setSize(d);
			Thread.sleep(1000);
	}

}
