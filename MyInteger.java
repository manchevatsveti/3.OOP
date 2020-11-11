package eddu.smg;

public class MyInteger {
	private int value;
	MyInteger(int v){
		value=v;
	}
	public int getValue() {
		return value;
	}
	public static boolean isEven(int v) {
		if(v%2==0) {
			return true;
		}
		return false;
	}
	public static boolean isOdd(int v) {
		if(v%2==1) {
			return true;
		}
		return false;
	}
	public static boolean isPrime(int v) {
		for (int i = 2; i <= v / 2; ++i) {
		      if (v % i == 0) {
		        return false;
		      }
		    }
		return true;
	}
	public boolean isEven() {
		if(value%2==0) {
			return true;
		}
		return false;
	}
	public boolean isOdd() {
		if(value%2==1) {
			return true;
		}
		return false;
	}
	public boolean isPrime() {
		for (int i = 2; i <= value / 2; ++i) {
		      if (value % i == 0) {
		        return false;
		      }
		    }
		return true;
	}
	public static boolean isEven(MyInteger v) {
		if(v.value%2==0) {
			return true;
		}
		return false;
	}
	public static boolean isOdd(MyInteger v) {
		if(v.value%2==1) {
			return true;
		}
		return false;
	}
	public static boolean isPrime(MyInteger v) {
		for (int i = 2; i <= v.value/ 2; ++i) {
		      if (v.value % i == 0) {
		        return false;
		      }
		    }
		return true;
	}
	public boolean equals(int v) {
		if(v==value) {
			return true;
		}
		return false;
	}
	public boolean equals(MyInteger v) {
		if(v.value==value) {
			return true;
		}
		return false;
	}
	public static int parseInt(char[] a){
	    int result=0;
	    for(int i=0;i<a.length;i++){
	        result=result*10+(a[i]-'0');
	    }
	    return result;
	}
	public static int parseInt(String v){
        int num1 = Integer.parseInt(v); 
	    return num1;
	}
}
