package tests;

import org.testng.annotations.Test;

public class TestSuite3 {
  @Test (dependsOnMethods = "test02") 
  public void test01() {
	  System.out.println("test01");
  }
  @Test
  public void test02() {
	  System.out.println("test02");
  }
}
