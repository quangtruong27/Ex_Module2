package ss9_set_map.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExercise {
	// a. Đếm số lần xuất hiện của ký tự
	public static Map<Character, Integer> countCharacter(String input) {
		Map<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if (c == ' ') continue;

			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		return map;
	}

	// b. Kiểm tra tên duy nhất
	public static Map<String, Integer> countName(String[] names) {
		Map<String, Integer> map = new LinkedHashMap<>();

		for (String name : names) {
			map.put(name, map.getOrDefault(name, 0) + 1);
		}
		return map;
	}
}
