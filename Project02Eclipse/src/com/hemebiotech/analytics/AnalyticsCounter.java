package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import com.hemebiotech.controller.AnalyticsControl;
/***
 * 
 * @author Frank Donald MBOUMDA BOUMDA
 *
 */


public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		
		AnalyticsControl control = new AnalyticsControl();
		control.run();
	}
}
