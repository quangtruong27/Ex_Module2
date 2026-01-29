package ss9_set_map.map;

import java.util.Map;

public class Main {
	public static void main(String[] args) {

		String input = "Tran Quang Truong";
		System.out.println("a. Dem ky tu:");

		Map<Character, Integer> charMap =
				MapExercise.countCharacter(input);

		for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		String[] names = {"An", "Binh", "An", "Nam", "Lan", "Binh"};

		System.out.println("b. Kiem tra ten duy naht:");
		Map<String, Integer> nameMap =
				MapExercise.countName(names);

		for (Map.Entry<String, Integer> entry : nameMap.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey() + " => duy nhat");
			} else {
				System.out.println(entry.getKey() + " => xuat hien " + entry.getValue() + " lan");
			}
		}
	}
}

