package com.Aarthi.TechAssessment3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
 
public class UtilityClass {
	String strEmail,strPassword,strUrl;
	public UtilityClass(){
		credentials();
	}
	public void credentials() {
File file = new File("C:\\Users\\akumaresan2\\Assessment3\\com.Aarthi.TechAssessment3\\src\\test\\resources\\Features\\Login.feature");
		
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch(FileNotFoundException e) {
			e.printStackTrace();			
		}
		
		Properties property = new Properties();
		
		try {
			property.load(fileInput);
		} catch(IOException e) {
			e.printStackTrace();
		}
		strUrl=property.getProperty("url");
		strEmail = property.getProperty("Email");
		strPassword = property.getProperty("password");
	}
}