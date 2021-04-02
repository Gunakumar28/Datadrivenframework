package base.clas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;

	public static void browserLaunch(String data) {
		if (driver == null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(data);
		}
	}

	public void sendKey(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void clickBtn(WebElement element) {
		element.click();
	}

	public String getpaticularTxt(WebElement element) {
		String text = element.getText();
		return text;
	}

	public String getTextFromWebpage(WebElement element, String data) {
		String attribute = element.getAttribute(data);
		System.out.println(attribute);
		return attribute;
	}

	public void implitywait(int data) {
		driver.manage().timeouts().implicitlyWait(data, TimeUnit.SECONDS);

	}

	public void VerifyAssert(String data, String cureentUrl) {
		Assert.assertEquals(data, cureentUrl);
		System.out.println(cureentUrl);
	}

	public String cureentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public boolean prsentOrNot(String element, String data) {
		boolean contains = element.contains(data);
		return contains;
	}

	public void output(String data) {
		System.out.println(data);

	}

	public void TakePic(String data) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		File file = new File(data);
		FileUtils.moveFile(screenshotAs, file);

	}

	public void close() {
		driver.quit();
	}

	public Date DateTime() {
		Date date = new Date();
		System.out.println(date);
		return date;
	}

	public String DataDriven(String path, String data, int num, int num1) throws IOException {
		File file = new File(path);
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(data);
		Row row = sheet.getRow(num);
		Cell cell = row.getCell(num1);
		int cellType = cell.getCellType();
		String value = "";
		if (cellType == 1) {
			value = cell.getStringCellValue();
		} else if (cellType == 0) {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long) numericCellValue;
			value = String.valueOf(l);
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy");
			value = format.format(dateCellValue);
		}
		return value;
	}
}
