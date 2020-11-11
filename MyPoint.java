package eddu.smg;
import java.lang.Math; 
public class MyPoint {
private double x=0,y=0;

MyPoint(){	
}
MyPoint(double x,double y){
	this.x=x;
	this.y=y;
}

public double getX() {
	return x;
}

public double getY() {
	return y;
}
public double distance(double x,double y) {
	return Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y,2));
}
public static double distance(MyPoint a, MyPoint b ) {
	return Math.sqrt(Math.pow(b.getX()-a.getX(),2)+Math.pow(b.getY()-a.getY(),2));
}
public double distance(MyPoint b) {
	return Math.sqrt(Math.pow(b.getX()-this.x,2)+Math.pow(b.getY()-this.y,2));
}
}
