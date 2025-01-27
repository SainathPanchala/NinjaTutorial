package org.QAfoxprojectGenericUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


/**
 * This class contains reusable methods to perform java related operations
 * @author Sai
 */

public class javaLibrary {
	/**
	 * This Method is used to pause the Script execution for sepcified time
	 * @param time
	 */
	public void pause(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * This Method is used to fetch current date and time
	 * @return
	 */
	public String getCurrentTime() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		return sdf.format(date);
	}
	/**
	 * This Method generate random number within the specified limit
	 */
	public int generateRandomNum(int limit) {
		Random random = new Random();
		return random.nextInt(limit);
	}

	}



