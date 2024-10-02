package com.rizz.test;
import java.util.*;
public class MapDemo1 {

	public static void main(String[] args) {
		Map<String, String> cred=new HashMap<String, String>();
		cred.put("apple@mail.com", "apple1212");
		cred.put("mango@mail.com", "mango1212");
		cred.put("banana@mail.com", "banana1212");
		cred.put("orange@mail.com", "orange1212");
		cred.put("orange@mail.com", "orange1212");
		cred.put(null, "null1212");
		Set<String> keySet = cred.keySet();
		Collection<String> values = cred.values();
		//System.out.println(cred);
		cred.forEach((k,v)->System.out.println(k+"="+v));
		System.out.println("=====================");
		
		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(1, "Ravi");
		hm1.put(2, "Rahul");
		hm1.put(3, "Rajen");
		
		HashMap<Integer, String> hm2	= new HashMap<>(hm1);

		System.out.println("Mapping of HashMap hm1 are : "	+ hm1);
	
		System.out.println("Mapping of HashMap hm2 are : " + hm2);
		int size = hm1.size();
		System.out.println(size);
		
		System.out.println(hm1.get(1).equals(hm2.get(1)));
		LinkedHashMap<String, String> lhm = new LinkedHashMap(cred);
		System.out.println(lhm);
		
//		keySet.forEach(System.out::println);
//		values.forEach(System.out::println);
	}

}
