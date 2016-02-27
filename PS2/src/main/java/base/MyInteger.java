package base;


public class MyInteger {
	private int iValue;

	public MyInteger(int val){
		iValue=val;
	}
	public boolean isEven(){
		return (getValue()%2==0);
	}
	
	public int getValue() {
		return iValue;
	}
	
	public boolean isOdd(){
		return (getValue()%2==1);
	}
	
	public boolean isPrime() {
        if (isEven()) return false;
        for (int i = 3; i * i <= getValue(); i += 2){
            if (getValue() % i == 0) return false;
        }
        return true;
	}
	
	public static boolean isEven(int n){
		return (n%2==0);
	}
	
	public static boolean isOdd(int n){
		return (n%2==1);
	}
	
	public static boolean isPrime(int n) {
        if (isEven(n)) return false;
        for (int i = 3; i * i <= n; i += 2){
            if (n % i == 0) return false;
        }
        return true;
	}
	
	public static boolean isEven(MyInteger n){
		return isEven(n.getValue());
	}
	
	public static boolean isOdd(MyInteger n){
		return isOdd(n.getValue());
	}
	
	public boolean equals(int n){
		return getValue()==n;
	}
	
	public boolean equals(MyInteger n) {
		return (n.getValue()==getValue());
	}
}

