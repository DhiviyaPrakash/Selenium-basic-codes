package TestNG;

import org.testng.annotations.Test;

public class BasicAnnotations {
  @Test(groups = "Run")
  public void testCase07() {
	  System.out.println("Test cae 01");
  }
  @Test (priority = 1)
  public void testCase02() {
	  System.out.println("Test cae 02");
  }	
  @Test
  public void testCase03() {
	  System.out.println("Test cae 03");
  }
  @Test(enabled = true, groups = "Run")
  public void testCase04() {
	  System.out.println("Test cae 04");
  }
  @Test(enabled = false )//this will be paused or excluded while running 
  public void testCase05() {
	  System.out.println("Test cae 05");
  }
}
