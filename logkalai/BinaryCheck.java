package logkalai;

public class BinaryCheck {
	public static void main(String[] args) {
		 int num=34;
		 StringBuffer sb=new StringBuffer();
		 while(num>=1) {
			 int some=num%2;
			 num=num/2;
			 sb.append(some);
		 }
		 System.out.println(sb.reverse());
	}

}
