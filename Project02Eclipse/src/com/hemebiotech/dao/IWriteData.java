package com.hemebiotech.dao;

import java.util.Map;

public interface IWriteData {
	/**
    *
    * writing the list of symptoms to a file
    *
    * @param map
    * @return generates a file that contains the list of symptoms
    *  in alphabetical order with the number of occurrences of each symptom
    */
	void write(Map<String, Integer> map);
}
