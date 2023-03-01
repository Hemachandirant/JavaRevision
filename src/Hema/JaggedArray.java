package Hema;

import java.util.Arrays;

public class JaggedArray {
	
	public static void main(String[] args) {
		
		int arr[][] = new int[4][];
		 arr[0] = new int[2];
		 arr[1] = new int[22];
		 arr[2] = new int[3];
		 arr[3] = new int[5];
		
		
		
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = (int)(Math.random()*100);
			}
		}
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			}
		
		 for(int i =0;i<arr.length;i++) {
			 System.out.println(Arrays.toString(arr[i]));
		 }

	}

}
