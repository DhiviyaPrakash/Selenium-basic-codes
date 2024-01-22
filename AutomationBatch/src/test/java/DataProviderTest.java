import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@DataProvider (name = "data-provider")
	public Object[][] dpMethod(){
	return new Object[][] {{2, 3 }, {5, 7}};
	}
  @Test(dataProvider ="data-provider" )// it calls data provider
  public void testCase(int a, int b) {
	  System.out.println(a+b);
	  
	  
  }
  @Test(dataProvider ="scroll-test",dataProviderClass = ScrollTest.class )// it calls data provider in ScrollTest class
  public void testCase(String a, String b) {
	  System.out.println(a);
	  System.out.println(b);
}
}
