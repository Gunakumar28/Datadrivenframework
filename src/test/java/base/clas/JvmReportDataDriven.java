package base.clas;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class JvmReportDataDriven extends LibGlobal {
	
	public static void JvmReport(String jshon) {
		File file = new File(System.getProperty("user.dir")+("\\src\\test\\resources\\ReportForDataDriven"));
		Configuration con = new Configuration(file, "Adactin Webpage");
		con.addClassifications("BuildName","VK12O85IO");
		con.addClassifications("author", "guna");
		con.addClassifications("Platform", "Windows");
		con.addClassifications("Enviroment", "UAT");
		con.addClassifications("sprint", "42");
		
		
		List< String> li = new ArrayList<String>();
		li.add(jshon);
		
		ReportBuilder builder = new ReportBuilder(li, con);
		Reportable generateReports = builder.generateReports();
		
		
		
	}

}
