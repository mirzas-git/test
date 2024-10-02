package com.rizz.test;

import java.util.*;

public class HashTableDemo1 {

	 public static void main(String[] argv) 
	    {
	        Map map = new TreeMap();  
	        map.put("key2", "value2");
	        map.put("key3", "value3");
	        map.put("key1", "value1");

	        System.out.println(map); //{}

	        SortedMap x = (SortedMap) map;
	        System.out.println("First key is :"+x.firstKey());
	        System.out.println("Last Key is :"+x.lastKey()); 
	     }
}