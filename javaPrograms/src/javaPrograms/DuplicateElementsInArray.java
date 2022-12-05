package javaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		String names[] = { "Java", "C", "Javascript", "Ruby", "Python", "Java" };
		// 1. using for loop:: time is O(nxn)=>worst method
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println(names[i]);
				}
			}
		}
		System.out.println("==================");
//2. Using HashSet::time is O(n)
		Set<String> set = new HashSet<String>();
		for (String name : names) {
			if (set.add(name) == false) {
				System.out.println(name);
			}
		}
		System.out.println("==================");
		// 3. using HashMap:: time is O(2n)
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String name : names) {
			Integer count = map.get(name);
			if (count == null) {
				map.put(name, 1);
			} else {
				map.put(name, ++count);
			}
			Set<Entry<String, Integer>> entrySet = map.entrySet();
			for (Entry<String, Integer> entry : entrySet) {
				if (entry.getValue() > 1) {
					System.out.println(entry.getKey());
				}
			}

		}
		
	}
}