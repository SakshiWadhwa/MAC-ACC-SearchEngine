package com.searchengine.WebSearchEngine;
/**
 * Ranking of Web Pages is done using merge sort.
 * Collections.sort by default uses merge sort.
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;

public class Sorting {
	
	public static void sortKey(Map<Integer, String> hm) {
		Map<Integer, String> map=new HashMap<Integer, String>();  
		System.out.println("After Sorting");  
		
		TreeMap<Integer,String> tm=new  TreeMap<Integer,String> (hm);  
		Iterator itr=tm.keySet().iterator();               
		while(itr.hasNext())    
		{    
			int key=(int)itr.next();  
			System.out.println("Occurrences:  "+key+"     File_name:   "+hm.get(key));  
		}   
		
		//Map<Integer, String> reverseSortedMap = new TreeMap<Integer,String>(Collections.reverseOrder()); 
		//reverseSortedMap.putAll(hm);
		//System.out.println(reverseSortedMap);	 
	}
}
