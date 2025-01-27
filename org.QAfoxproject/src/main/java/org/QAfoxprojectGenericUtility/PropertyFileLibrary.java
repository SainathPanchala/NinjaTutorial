package org.QAfoxprojectGenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Reporter;

public class PropertyFileLibrary {
	FileInputStream fis;
	FileOutputStream fos;
	Properties property;
	/**
	 * initialize property file
	 */
	public void initPropertyFile() {
		try {
			fis = new FileInputStream(PathConstant.PROPERTY_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//create an object for properties class
		property=new Properties();
		//load the property file
		try {
			property.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * this method is used to read the data from property file
	 * @param key
	 * @return
	 */
	public String readData(String key) {
		return property.getProperty(key);
	}
	/**
	 * this method is used to write the data from property file
	 * @param key
	 * @param value
	 */
	public void writeData(String value, String key) {
		property.put(key, value);
	//create instance for fos class
	try {
		fos=new FileOutputStream(PathConstant.PROPERTY_PATH);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//STORE THE property file
	try {
		property.store(fos, "update the new key value");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	/**
	 * this method is used to display the data from property file
	 * @param key
	 * 
	 */
	public void displayPropertyFile(String key) {
		String data=property.getProperty(key);
		Reporter.log(key+":"+data,true);
	}

}
