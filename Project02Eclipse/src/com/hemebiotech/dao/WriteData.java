package com.hemebiotech.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/*
 * simple implementation of IWrite class
 */
public class WriteData implements IWriteData {

	@Override
	/**
	 * Final result list of symptoms in a file: result.out
	 */
	public void write(Map<String, Integer> map) {
		try {
			FileWriter writer = new FileWriter ("result.out");
			map.forEach(
					(key, value)->{ try {
						writer.write (key +" : " + value + "\n");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} }
					);
			writer.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
