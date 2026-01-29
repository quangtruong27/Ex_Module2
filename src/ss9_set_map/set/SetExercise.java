package ss9_set_map.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetExercise {
	// a. Loại bỏ phần tử trùng lặp
	public static Set<Integer> removeDuplicate(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int x : arr) {
			set.add(x);
		}
		return set;
	}

	// b. Tính tổng các phần tử không trùng
	public static int sumUnique(int[] arr) {
		Set<Integer> set = removeDuplicate(arr);
		int sum = 0;
		for (int x : set) {
			sum += x;
		}
		return sum;
	}

	// c. Tìm phần tử chung của hai mảng
	public static Set<Integer> findCommon(int[] arr1, int[] arr2) {
		Set<Integer> set1 = removeDuplicate(arr1);
		Set<Integer> set2 = removeDuplicate(arr2);

		set1.retainAll(set2);
		return set1;
	}

	// d. Tìm min và max
	public static void findMinMax(int[] arr) {
		Set<Integer> set = removeDuplicate(arr);

		int min = Collections.min(set);
		int max = Collections.max(set);

		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
	}
}