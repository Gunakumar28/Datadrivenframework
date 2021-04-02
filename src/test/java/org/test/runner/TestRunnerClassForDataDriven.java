package org.test.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import base.clas.JvmReportDataDriven;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue ={"org.stepdefn.data.driven"},monochrome=true, tags= {"@reg"}, plugin = {"pretty","html:src\\test\\resources\\JsonReportForDataDriven","json:src\\test\\resources\\ReportForDataDriven\\JVM.json"})
public class TestRunnerClassForDataDriven {

	@AfterClass
	public static void Report() {
		JvmReportDataDriven.JvmReport(System.getProperty("user.dir") +"\\src\\test\\resources\\ReportForDataDriven\\JVM.json");

	}

}
