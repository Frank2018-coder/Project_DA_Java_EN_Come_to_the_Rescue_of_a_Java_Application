package com.hemebiotech.control;

import java.util.List;

import com.hemebiotech.dao.ISymptomReader;
import com.hemebiotech.dao.ReadSymptomDataFromFile;

public class AnalyticsController {
    
	public void run() {
		//file read logic
		ISymptomReader readerSymptomList = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> list = readerSymptomList.GetSymptoms();
		 for(String l : list) {
			 System.out.println(l + "\n");
		 }
	}
}
