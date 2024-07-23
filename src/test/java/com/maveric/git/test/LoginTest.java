package com.maveric.git.test;

import org.testng.annotations.Test;

import com.maveric.git.DatProvider.TestDataProvider;

import org.testng.annotations.BeforeMethod;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class LoginTest
{
	private WebDriver driver;
	private LoginPageBean pageBean;
	
  
  @BeforeMethod
  public void setSubTestEnv() 
  {
	  driver=Factory.getdriver();
	  driver.get("https://github.com/login");
	  pageBean = PageFactory.initElements(driver, LoginPageBean.class);	  
  }
  
// @Test(testName="Test Git Sign-In Service for invalid credential")
//  public void test1() 
//  {
//	  pageBean.setUsername("hgcjhg");
//	  pageBean.setPassword("bggdv");
//	  pageBean.signIn();
//	  String expectedErrorMsg="Incorrect username or password.";
//	  String actualErrorMsg=pageBean.getErrorMessage();
//	  Assertions.assertEquals(expectedErrorMsg,actualErrorMsg);
//	  
 //}
//  @Test(testName="Test Git Sign-In Service for Empty ")
//  public void test2() 
//  {
//	  pageBean.setUsername("");
//	  pageBean.setPassword("");
//	  pageBean.signIn();
//	  String expectedErrorMsg="Incorrect username or password.";
//	  String actualErrorMsg=pageBean.getErrorMessage();
//	  Assertions.assertEquals(expectedErrorMsg,actualErrorMsg);
//	  
//  }
@Test (testName = "Test Git Sign-In Service for invalid credentials ")
public void test1() {	
	pageBean.setUsername("BalajiPatil8087");
	pageBean.setPassword("Gt@250398");
	pageBean.signIn();
	String expectedErrorMsg ="Incorrect username or password.";
	String actualErrorMsg = pageBean.getErrorMessage();
	Assertions.assertEquals(expectedErrorMsg, actualErrorMsg);
}

@Test(dataProviderClass=TestDataProvider.class,dataProvider="getValidUsernamePassword")

public void Test2() {
	System.out.println("valid creadentials");
	pageBean.setUsername("GauravTelgu");
	pageBean.setPassword("Gt@250398");
	pageBean.signIn();
}

  @AfterMethod
  public void afterMethod()
  {
	  //driver.close();
  }

}
