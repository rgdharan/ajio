package com.ajio.config;

import org.openqa.selenium.WebDriver;

import PageObjectManager.Ajiopage;

public class PageObjectManager {

	public static WebDriver driver;
	
	private Ajiopage aj;
	
	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Ajiopage getinstanceAjiopage() {
		aj = new Ajiopage(driver);
		return aj;
	}
}
