package ss7_dsa_list.myarraylist;

public class MyArrayList {

	// Mảng dùng để lưu dữ liệu
	private int[] elementData;

	// Dung lượng của mảng
	private int capacity;

	// Số phần tử thực tế đang có
	private int size;

	// Mảng rỗng dùng làm trạng thái ban đầu (chưa cấp phát bộ nhớ)
	private int[] emptyArr = {};


	// Constructor không tham số
	public MyArrayList() {
		elementData = emptyArr; // ban đầu trỏ tới mảng rỗng
	}

	// Constructor có dung lượng ban đầu
	public MyArrayList(int capacity) {
		this.capacity = capacity;
		elementData = new int[capacity]; // cấp phát mảng với dung lượng truyền vào
	}

	// a. add(int element): thêm phần tử vào cuối
	public void add(int element) {

		// Nếu elementData đang trỏ tới mảng rỗng ban đầu
		// → chưa được cấp phát bộ nhớ thật
		if (elementData == emptyArr) {
			capacity = 10;                 // gán dung lượng mặc định
			elementData = new int[10];     // cấp phát mảng mới
		}

		// Nếu mảng đã đầy
		if (capacity == size) {

			// Tăng dung lượng lên 1.5 lần
			capacity *= 1.5;

			// Tránh trường hợp capacity không tăng
			// ví dụ: capacity = 1 → 1 * 1.5 = 1
			if (capacity == size) {
				capacity++;
			}

			// Tạo mảng mới với dung lượng lớn hơn
			int[] temp = new int[capacity];

			// Sao chép dữ liệu cũ sang mảng mới
			for (int i = 0; i < size; i++) {
				temp[i] = elementData[i];
			}

			// Cho elementData trỏ sang mảng mới
			elementData = temp;
		}

		// Thêm phần tử vào cuối mảng
		elementData[size] = element;

		// Tăng số phần tử
		size++;
	}

	// b. toString(): hiển thị danh sách phần tử
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		// Chỉ duyệt tới size (không duyệt hết capacity)
		for (int i = 0; i < size; i++) {
			sb.append(elementData[i]).append("\t");
		}
		return sb.toString();
	}

	// c. add(int index, int element): thêm phần tử tại vị trí index
	public void add(int index, int element) {

		// Kiểm tra index hợp lệ
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index khong hop le: " + index);
		}

		// Nếu mảng chưa được cấp phát
		if (elementData == emptyArr) {
			capacity = 10;
			elementData = new int[10];
		}

		// Nếu mảng đầy thì mở rộng
		if (capacity == size) {
			capacity *= 1.5;
			if (capacity == size) {
				capacity++;
			}

			int[] temp = new int[capacity];
			for (int i = 0; i < size; i++) {
				temp[i] = elementData[i];
			}
			elementData = temp;
		}

		// Dời các phần tử sang phải từ cuối về index
		for (int i = size; i > index; i--) {
			elementData[i] = elementData[i - 1];
		}

		// Gán phần tử mới vào vị trí index
		elementData[index] = element;
		size++;
	}

	// d. set(int index, int element): thay thế phần tử tại index
	public void set(int index, int element) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index khong hop le: " + index);
		}
		elementData[index] = element;
	}

	// e. get(int index): lấy phần tử tại index
	public int get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index khong hop le: " + index);
		}
		return elementData[index];
	}

	// f. indexOf(int element): tìm vị trí xuất hiện đầu tiên
	public int indexOf(int element) {
		for (int i = 0; i < size; i++) {
			if (elementData[i] == element) {
				return i;
			}
		}
		return -1; // không tìm thấy
	}

	// g. lastIndexOf(int element): tìm vị trí xuất hiện cuối cùng
	public int lastIndexOf(int element) {
		for (int i = size - 1; i >= 0; i--) {
			if (elementData[i] == element) {
				return i;
			}
		}
		return -1;
	}

	// h. remove(int index): xóa phần tử tại index
	public int remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index khong hop le: " + index);
		}

		// Lưu lại giá trị bị xóa
		int removedValue = elementData[index];

		// Dồn các phần tử bên phải sang trái
		for (int i = index; i < size - 1; i++) {
			elementData[i] = elementData[i + 1];
		}

		size--; // giảm số phần tử
		return removedValue;
	}

	// i. removeElement(int element): xóa tất cả phần tử có giá trị element
	public void removeElement(int element) {

		int i = 0;
		while (i < size) {

			// Nếu tìm thấy phần tử cần xóa
			if (elementData[i] == element) {
				remove(i);
				// KHÔNG tăng i vì sau khi dồn,
				// phần tử mới đã nằm ở vị trí i
			} else {
				i++;
			}
		}
	}
}
