package com.acc.lkm;
import java.util.*;
public class TreemapDem {
	public static void main(String[] args) {
		NavigableMap<String,Integer> tm = new TreeMap();
		tm.put("anuroop",90);
		tm.put("sai", 75);
		tm.put("akhil",80);
		tm.put("shiva", 100);
		tm.put("rowdy", 94);
		tm.put("deyyam", 88);
		
		System.out.println(tm);
		for(String key:tm.keySet()) {
			System.out.println(key+" "+tm.get(key));
		}
		
		for(Map.Entry m2:tm.entrySet()) {
			System.out.println(m2.getKey()+" "+m2.getValue());
		}
		
		tm.remove("sai");
		System.out.println(tm);
		System.out.println(tm.descendingMap());
		System.out.println(tm.headMap("shiva",true));
		System.out.println(tm.subMap("anuroop",true,"shiva",false));
	}
}
