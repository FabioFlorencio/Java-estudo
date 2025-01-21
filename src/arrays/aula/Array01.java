package arrays.aula;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		
		int[] num = {9,5,0,7,4,2,6,3,1,8};
		int[] num2 = new int[10];
		
		//Arrays.sort(num);
		Arrays.fill(num2,10);
		
		
		for(int n: num2) {
			System.out.printf("%d - ", n);
		}	
	}
}
