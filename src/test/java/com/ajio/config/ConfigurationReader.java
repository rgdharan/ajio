package com.ajio.config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties p;

	public ConfigurationReader() throws Throwable {
		File f = new File(
				"C:\\Users\\Admin\\eclipse-workspace\\org.com.ajio\\src\\main\\java\\com\\ajio\\properties\\property.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public static String getbrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}

	public static String geturl() {
		String url = p.getProperty("url");
		return url;
	}
}
