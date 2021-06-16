package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;

public class BasePageUtil<T> {

	protected WebDriver driver;
	public int statusCode;

	public BasePageUtil(WebDriver driver) {
		this.driver = driver;
	}



	protected WebElement setObjectBy(By by, String value) {
		WebElement element = getElementBy(by);
		HighlightElement(element);
		element.clear();
		element.sendKeys(value);
		return element;
	}



	public void sleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
		}
	}


	protected void HighlightElement(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
				"color: red; border: 1px dashed red;");
	}

	protected WebElement clickObjectBy(By by) {
		WebElement element = driver.findElement(by);
		HighlightElement(element);
		element.click();
		return element;
	}



	public WebElement getElementBy(By by) {
		return driver.findElement(by);
	}



	public String getCurrentUrl() {
		return driver.getCurrentUrl().trim();
	}


	public void executeJavascript(String script, Object... obj) {
		((JavascriptExecutor) driver).executeScript(script, obj);
	}

	public boolean isTextPresent(By by, String text) {
		try {
			return driver.findElement(by).getText().contains(text);
		} catch (NullPointerException e) {
			return false;
		}
	}


	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	public boolean isElementPresentAndDisplay(By by) {
		try {
			return driver.findElement(by).isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}



public WebElement scrollElementBy(By by){
		WebElement element = driver.findElement(by);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		// sleep(1000);
		return element;
	}

	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(fileWithPath);

		FileUtils.copyFile(SrcFile, DestFile);

	}
}

