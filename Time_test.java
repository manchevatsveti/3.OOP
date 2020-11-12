package eddu.smg;

public class Time_test {

	public static void main(String[] args) {
		Time time = new Time();
		Time time1 = new Time(5, 23, 55);
		Time time2 = new Time(555550000);
        System.out.println(time.getHour()+ ":"+ time.getMinute()+ ":"+ time.getSecond());
        System.out.println(time1.getHour()+ ":"+ time1.getMinute()+ ":"+ time1.getSecond());
        System.out.println(time2.getHour()+ ":"+ time2.getMinute()+ ":"+ time2.getSecond());

	}

}
