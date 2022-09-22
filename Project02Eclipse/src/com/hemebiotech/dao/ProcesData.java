package com.hemebiotech.dao;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
 * simple implementation of IProces class
 */

public class ProcesData implements IProcesData{

	/**
	 * List of symptoms in alphabetical order and number of occurrences 
	 */
	@Override
	public Map<String, Integer> countAndSort(List<String> list) {
		// TODO Auto-generated method stub
		Map<String, Integer>map = new TreeMap<String, Integer>();
		
		for(String item : list) {
			if(map.containsKey(item)) {
				int i = map.get(item);
				map.put(item, i + 1);
			}else {
				map.put(item, 1);
			}
		}
		return map;
	}

}
