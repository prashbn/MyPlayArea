package Driver;


import org.openqa.selenium.By;

import com.experitest.selenium.MobileWebDriver;

public class FuncationalComponents {

	    private String host = "localhost";
	    private int port = 8889;
	    private String projectBaseDirectory = "C:\\Users\\Prasha\\workspace\\project2";
	    protected MobileWebDriver driver = null;

	    public void setUpDriver(){
	        driver = new MobileWebDriver( host, port, projectBaseDirectory, "xml", "reports", "Untitled");
	    }
	    
	    public void setdevice()
	    {
	    	driver.setDevice("adb:Android SDK built for x86");
	    	
	    }
	    
	    public void launchApplication(String packageName)
	    {
	    	 driver.application(packageName).launch(true, true);
	    	  driver.useNativeIdentification();
	    }

	  
	    public void testTC001(){
	       
	        driver.findElement(By.xpath("//*[@class='android.widget.ImageButton']")).click(1);
	        driver.findElement(By.id("title")).click(1);
	        driver.findElement(By.linkText("My Schedule")).verify();
	        driver.findElement(By.linkText("Jun 26")).click(1);
	        driver.findElement(By.id("start_time")).verify();
	        String str0 = driver.client.elementGetText("NATIVE", "id=start_time", 0);
	        driver.findElement(By.id("slot_title")).verify();
	        String str1 = driver.client.elementGetText("NATIVE", "id=slot_title", 0);
	        driver.findElement(By.xpath("//*[@class='android.widget.ImageButton']")).click(1);
	    }

	
	    public void tearDown(){
	        // Generates a report of the test case.
	        // For more information - http://experitest.com/studio/help2/WebHelp/help.htm#Report_Of_Executed_Script.htm .
	        driver.generateReport(false);
	        // Releases the client so that other clients can approach the agent in the near future. 
	        driver.releaseClient();
	    }

}
