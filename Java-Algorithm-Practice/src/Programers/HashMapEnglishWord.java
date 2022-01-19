package Programers;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEnglishWord {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("orange", "오렌지");
		map.put("melon", "멜론");
		System.out.println(map);
		for(String key : map.keySet()) {
			System.out.printf("key : %s , value : %s \n", key, map.get(key));
		}
		map.remove("melon");
		System.out.println(map); // {banana=바나나, orange=오렌지, apple=사과}
		System.out.println(map.keySet()); // [banana, orange, apple]
	
		Iterator<String> key = map.keySet().iterator();
		System.out.println("key = " + map.get(key));
	}
}
