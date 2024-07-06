package Util;

import java.io.File;

public class TestConfig {
	
	public static void cleanReportFiles() {
		try {
			String rootDir = System.getProperty("user.dir");
			File allureResultPath = new File(rootDir + "/allure-results");
			for(File file : allureResultPath.listFiles()) {
				file.delete();
			} 
		}catch (Exception e) {
			System.out.println("No files to delete");
		}
	}

}
