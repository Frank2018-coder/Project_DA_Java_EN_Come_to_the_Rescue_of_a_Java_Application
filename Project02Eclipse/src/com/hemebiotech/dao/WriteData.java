package com.hemebiotech.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteData implements IWriteData {

	@Override
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
