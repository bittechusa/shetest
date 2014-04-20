package com.basetest;

import org.junit.Test;
import org.openqa.selenium.By;

public class SmokeTest  extends BaseTest 

{
	@Test
	public void clickMenslink() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id='main-nav-men']/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='departmentLeftNaviContainer']/div[1]/ul[1]/li[2]/a/strong")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("html/body/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/a")).click();
		//Thread.sleep(3000);
	}
	
	

}
