package eddu.smg;

public class Time {
private int hour,minute,second;
private long time;
Time(){
	time = System.currentTimeMillis();
}
Time(long time) {
    this.time = time;
}
Time(int h, int m,int s){
	this.hour=h;
	this.minute=m;
	this.second=s;
	time = h*(1000 * 60 * 60)+ m*(1000 * 60)+s*1000;
}

public int getHour() {
	 return (int)(time / (1000 * 60 * 60)) % 24;
}

public int getMinute() {
	return (int)(time / (1000 * 60)) % 60;
}

public int getSecond() {
	return (int)(time / 1000) % 60;
}
public void setTime(long elapsedTime) {
    time = elapsedTime;
}
}
