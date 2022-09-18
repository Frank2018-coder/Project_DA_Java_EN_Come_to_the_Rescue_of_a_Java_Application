package com.hemebiotech.dao;

import java.util.List;
import java.util.Map;

public interface IProcesData {
	/**
    *
    * Count and sort file elements
    *
    * @param list
    * @return
    */
   Map<String, Integer> countAndSort(List<String> list);
   
}
