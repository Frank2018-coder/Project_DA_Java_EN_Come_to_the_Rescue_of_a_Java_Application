package com.hemebiotech.controller;

import java.util.List;
import java.util.Map;

import com.hemebiotech.dao.IProcesData;
import com.hemebiotech.dao.ISymptomReader;
import com.hemebiotech.dao.IWriteData;
import com.hemebiotech.dao.ProcesData;
import com.hemebiotech.dao.ReadSymptomDataFromFile;
import com.hemebiotech.dao.WriteData;

/**
 * implements the control logic of the operations of reading, 
 * counting, sorting and writing of the list of symptoms
 */
public class AnalyticsControl {
    
	public void run() {
		//file read logic
		ISymptomReader readerSymptomList = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> list = readerSymptomList.GetSymptoms();
		 for(String l : list) {
			 System.out.println(l+"\n");
		 }
		 
		 //proces
		 IProcesData iProces = new ProcesData();
		 Map<String, Integer> map = iProces.countAndSort(list);
		 System.out.println(map);
		 
		 //writing
		 IWriteData write = new WriteData();
		 write.write(map);
	}
}
