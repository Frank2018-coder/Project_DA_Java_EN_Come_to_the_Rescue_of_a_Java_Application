package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import com.hemebiotech.control.AnalyticsController;

public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		
		AnalyticsController control = new AnalyticsController();
		control.run();
	}
}
