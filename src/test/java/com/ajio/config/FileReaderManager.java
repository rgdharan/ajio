package com.ajio.config;


public class FileReaderManager {

	public FileReaderManager() {

	}

	public ConfigurationReader getInstance() throws Throwable {
		ConfigurationReader reader = new ConfigurationReader();
		return reader;
		
	}
	
	public static FileReaderManager getInstanceFR() {
		FileReaderManager helper = new FileReaderManager();
		return helper;
	}
}
