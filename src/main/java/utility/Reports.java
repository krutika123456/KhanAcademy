package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	public static ExtentReports createReports(){
		ExtentReports reports= new ExtentReports(); 
		ExtentSparkReporter html=new ExtentSparkReporter("ExtentReport.html");	
		
		reports.attachReporter(html);
		
		reports.setSystemInfo("Test","Regression");
		return reports;
		
		}

	}
