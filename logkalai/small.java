package logkalai;

public class small {
	public static void main(String[]args) {
		String []a= {"23","14","45","67","34"};
		int aa=Integer.parseInt(a[0]);
		int bb=Integer.parseInt(a[1]);
		int cc=Integer.parseInt(a[2]);
		int dd=Integer.parseInt(a[3]);
		int ee=Integer.parseInt(a[4]);
		int [] b= {aa,bb,cc,dd,ee};

		 int mini=b[0];
		for(int i=0; i<b.length; i++) {
			if(b[i]<mini) {
				mini=b[i];
			}
		}
		System.out.println(mini);
	}

}
