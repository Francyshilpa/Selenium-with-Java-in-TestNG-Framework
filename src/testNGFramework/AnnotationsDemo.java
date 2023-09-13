package testNGFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsDemo {
  @Test
  public void f() {
	  System.out.println("printing f");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("printing beforemethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("printing aftermethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("printing beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("printing afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("printing beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("printing aftertest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("printing beforesuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("printing aftersuite");
  }

}
