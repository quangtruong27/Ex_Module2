package ss2_constructor.time;

public class Main {
	public static void main(String[] args) {
		Time a = new Time();
		a.output();                           // 00:00:00
		Time b = new Time(7);
		b.output();                           // 07:00:00
		Time c = new Time(7, 30);
		c.output();                           // 07:30:00
		Time d = new Time(7, 30, 50);
		d.output();                           // 07:30:50
		Time f = new Time(d);
		f.output();                           // 07:30:50
	}
}
