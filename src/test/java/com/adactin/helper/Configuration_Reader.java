package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Configuration_Reader {
	public static WebDriver driver;
	public static Properties p;
	
	public Configuration_Reader() throws Throwable {
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\Adactin_cucumber\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public String getbrowser() {
		String browser = p.getProperty("browser");
		return browser;
		
	}
	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}

}
