package genericLibrary;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersImplementation implements ITestListener {
		
	
		public void onTestFailure(ITestResult result) {
			//UtilityMethods.getScreenshot(result.getName());
			System.out.println("Test Failed");
		}
	    
		public void onStart(ITestContext context) {
			System.out.println("Test Case Execution Started");
		}
	    
	    public void onFinish(ITestContext context) {
	    	System.out.println("Test case Exeution Finished");
	    	
	    }
	}

