package com.collections.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> hashmap=new HashMap<String,String>();
		hashmap.put("srinivas", "gss");
		hashmap.put("sankar", "sankar");
		hashmap.put("satya", "gss");
		hashmap.put("mounika", "Mouni");
		Set<String> keySet=hashmap.keySet();
		for(String keys:keySet) {
			System.out.println(keys);
		}
		
		for(Map.Entry<String, String>  ent: hashmap.entrySet()) {
			System.out.println("Entry Key"+ent.getKey()+"Entry Value"+ent.getValue());
		}

	}

}
