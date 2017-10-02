package io.robusta.java.classic;

import java.util.*;
import java.util.Map.Entry;

/**
 *
 * Map : We add entry with map.put(key, val) We read value with map.get(key) We
 * read keys with map.keySet() We read values with map.values() We read entries
 * with map.entrySet()
 *
 *
 */
public class MapApp {

	Map<Integer, String> buildMap(int key1, String val1, int key2, String val2) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(key1, val1);
		map.put(key2, val2);

		return map;
	}

	Map<Integer, String> buildMap(int[] keys, String[] values) {
		if (keys.length != values.length) {
			throw new IllegalArgumentException("looser");
		}

		Map<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < keys.length; i++)
			map.put(keys[i], values[i]);

		return map;
	}

	Set<Integer> getKeys(Map<Integer, String> map) {

		return map.keySet();
	}

	List<Integer> getKeysAsList(Map<Integer, String> map) {
		List<Integer> list = new ArrayList<>();
		list.addAll(map.keySet());

		return list;
	}

	Set<Entry<Integer, String>> getEntries(Map<Integer, String> map) {
		
		return map.entrySet();
	}

	List<String> getValues(Map<Integer, String> map) {
		List<String> list = new ArrayList<>();
		list.addAll(map.values());
		return list;
	}

	String[] getValuesFromMap(Map<Integer, String> map, int key1, int key2) {
		
		String[] tab = new String[2];
		tab[0] = map.get(key1);
		tab[1] = map.get(key2);
		return tab;
	}

	List<Integer> getKeysHavingValue(Map<Integer, String> map, String value) {
		List<Integer> list = new ArrayList<>();
		Set<Entry<Integer,String>> set = new HashSet<>();
		set = map.entrySet();
		return set;
	}

	List<Integer> getKeysHavingValueAnyValue(Map<Integer, String> map, String... values) {
		return null;
	}

	// TODO: move up
	String displayMap(Map<Integer, String> map) {
		// Use map.entrySet()to have nice display
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Entry:" + entry.getKey());
			System.out.println("Value:" + entry.getValue());
		}

		return null;
	}

	List<Card> getCards(Map<Integer, Character> map) {
		return null;
	}

}
