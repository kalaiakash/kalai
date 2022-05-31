package logkalai;

public class Decimalcheck {
	public static void main(String[] args) {
		float num1=10.5f;
		int a=(int)num1;
		float f1=num1-a;
		float num2=20.8f;
		int b=(int)num2;
		float f2=num2-b;
		if(f1==f2) {
			System.out.println("Same");
		}
		else {
			System.out.println("Different");
		}
	}

}
