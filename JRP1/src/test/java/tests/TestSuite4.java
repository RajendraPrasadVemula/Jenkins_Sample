package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite4 {
  @Test
  public void test01() {
	  System.out.println("test01");
  }
  @Test
  public void test02() {
	  Assert.assertTrue(1<2);
	  System.out.println("test02");
  }
}
