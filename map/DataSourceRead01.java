package com.javastudy.ch08.map;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class DataSourceRead01 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		FileInputStream fis = null;
		BufferedInputStream bis = null;

//		파일, 디렉터리 다루기 위해 지원하는 클래스
		File f = new File("datasource.properties");
		System.out.println(f.getAbsolutePath());
		
		try {
			fis = new FileInputStream(f);
			bis = new BufferedInputStream(fis);
			
			prop.load(bis);
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				if(bis != null) bis.close();
				if(fis != null) fis.close();
			} 
			catch (IOException e) {
				// TODO: handle exception
			}
		}
		
		System.out.println(prop);
		Set<Object> keySet = prop.keySet();
		for(Object obj : keySet) {
			String key = (String) obj;
			System.out.println(key+ " : " + prop.getProperty(key));
		}
		
	}
}