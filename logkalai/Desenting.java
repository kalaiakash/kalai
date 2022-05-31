package logkalai;


import java.util.Arrays;
import java.util.Collections;

public class Desenting {
	public static void main(String[] args) {
		String[]numbers= {"3","4","6","8","9","2"};
		Arrays.sort(numbers,Collections.reverseOrder());
		System.out.println(Arrays.toString(numbers));
	}

}
