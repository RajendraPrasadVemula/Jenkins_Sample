package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSuite1 {
  @Test (description ="sample test case")
  public void test01() {
	  System.out.println("test01");
  }
  @Test 
  @Parameters ("browser")
		  public void test02(String browser) {
	  System.out.println("test02 - "+browser);
  }
  @Test (expectedExceptions = ArithmeticException.class)
  public void test03() {
	  System.out.println("test03");
  }
}
