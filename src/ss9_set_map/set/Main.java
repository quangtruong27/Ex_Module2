package ss9_set_map.set;

public class Main {
	public static void main(String[] args) {

		int[] arr = {1, 2, 2, 3, 4, 4, 5};
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {3, 4, 5, 6, 7};

		System.out.println("a. Khong trung:");
		System.out.println(SetExercise.removeDuplicate(arr));

		System.out.println("b. Tong khong trung:");
		System.out.println(SetExercise.sumUnique(arr));

		System.out.println("c. Phan tu chung:");
		System.out.println(SetExercise.findCommon(arr1, arr2));

		System.out.println("d. Min / Max:");
		SetExercise.findMinMax(arr);
	}
}
