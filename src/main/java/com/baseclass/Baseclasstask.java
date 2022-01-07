package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclasstask {
	public static WebDriver driver;
	public static Actions ac;
	public static Robot r;
	public static WebDriver Browserlaunch(String bname) {
		try {
			if (bname.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir")+("\\Driver\\chromedriver.exe"));
						 driver = new ChromeDriver();
						 
			}else if (bname.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
						 driver = new InternetExplorerDriver();
			}else {
				System.out.println("invalid browser");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	return driver;
	}
	

	public static void geturl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void sendkeys(WebElement element, CharSequence value) {
		
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void click(WebElement element)
	{
		element.click();
	}
	public static void frames(String frame, WebElement assign) {
		try {
			if (frame.equalsIgnoreCase("inside")) {
				driver.switchTo().frame(assign);
			}else if (frame.equalsIgnoreCase("default")) {
				driver.switchTo().defaultContent();
			}else if (frame.equalsIgnoreCase("parent")) {
				driver.switchTo().parentFrame();
			}else {
				System.out.println("invalid frame");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void keypress(String press) throws AWTException {
		try {
			r = new Robot();
			if (press.equalsIgnoreCase("down")) {
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
			} else if (press.equalsIgnoreCase("enter")) {
				r.keyPress(KeyEvent.VK_ENTER);
			} else {
				System.out.println("error-invalid");
			}
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
	
	public static void Actions(String act, WebElement search) {
		try {
			ac = new Actions(driver);
			if (act.equalsIgnoreCase("move")) {
				ac.moveToElement(search).perform();
			}else if (act.equalsIgnoreCase("click")) {
				ac.click(search).perform();
			}else if (act.equalsIgnoreCase("contextclick")) {
				ac.contextClick(search).perform();
			}else if (act.equalsIgnoreCase("draganddrop")) {
				ac.dragAndDrop(search, search).perform();
			}else {
				System.out.println("actions error");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void navigate(String name, String url) {
		try {
			if (name.equalsIgnoreCase("to")) {
				driver.navigate().to(url);
			}else if (name.equalsIgnoreCase("back")) {
				driver.navigate().back();
			}else if (name.equalsIgnoreCase("forward")) {
				driver.navigate().forward();
			}else if (name.equalsIgnoreCase("refresh")) {
				driver.navigate().refresh();
			}else {
				System.out.println("navigation error");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	public static void scroll(String sc, WebElement scrollup) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			if (sc.equalsIgnoreCase("up")) {
				js.executeScript("arguments[0].scrollIntoView();", scrollup);
			}else if (sc.equalsIgnoreCase("down")) {
				js.executeScript("arguments[0].scrollIntoView();", scrollup);//we can assign differ value
			}else {
				System.out.println("scroll error");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void screenshot( ) throws Throwable {
		try {
			TakesScreenshot ss = (TakesScreenshot) driver;
			File screen = ss.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\admin\\eclipse-workspace\\Selenium\\Screenshot//pics.png");
			FileUtils.copyFile(screen, dest);
		} catch (WebDriverException e) {
			e.printStackTrace();
		}
	}
//	public static void newtab() {
//		try {
//			d.switchTo().newWindow(WindowType.TAB);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	public static void dropdown(String dd, WebElement value, String required) {
		try {
			if (dd.equalsIgnoreCase("value")) {
				Select s1 = new Select(value);
				s1.selectByValue(required);
				}else if (dd.equalsIgnoreCase("text")) {
					Select s1 = new Select(value);
					s1.selectByVisibleText(required);
				}else {
					System.out.println("invalid dropboxes");
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void alert(String al, String enter) {
		try {
			if (al.equalsIgnoreCase("accept")) {
				driver.switchTo().alert().accept();
			}else if (al.equalsIgnoreCase("cancel")) {
				driver.switchTo().alert().dismiss();
			}else if (al.equalsIgnoreCase("send")) {
				driver.switchTo().alert().sendKeys(enter);
			}else {
				System.out.println("alert error");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}}
	public static void close() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void quit() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
