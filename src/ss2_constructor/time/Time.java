package ss2_constructor.time;

/**
 * Tạo lớp ThoiGian với các constructor và phương thức xuat() để đáp ứng yêu cầu đề bài.
 */
public class Time {

	private int hour;
	private int minutur;
	private int second;

	public Time() {
		this.hour = 0;
		this.minutur = 0;
		this.second = 0;
	}

	public Time(int hour) {
		this.hour = hour;
		this.minutur = 0;
		this.second = 0;
	}

	public Time(int hour, int minutur) {
		this.hour = hour;
		this.minutur = minutur;
		this.second = 0;
	}

	public Time(int hour, int minutur, int second) {
		this.hour = hour;
		this.minutur = minutur;
		this.second = second;
	}

	//tao doi tuong moi dua tren du lie cua doi tuong cu
	public Time(Time time){
		this.hour = time.hour;
		this.minutur = time.minutur;
		this.second = time.second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinutur() {
		return minutur;
	}

	public void setMinutur(int minutur) {
		this.minutur = minutur;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void output(){
		System.out.printf("%02d:%02d:%02d\n", hour, minutur,second);
	}
}
