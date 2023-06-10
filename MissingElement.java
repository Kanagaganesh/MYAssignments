package week3;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		
			// Here is the input
			int[] arr = {1,2,3,4,7,6,8};
			
			Arrays.sort(arr);
			

			int length = arr.length;
			System.out.println("The length of the array:"+length);
			for(int i=arr[0];i<arr.length;i++) {
				if(i!=arr[i]) {
					System.out.println("The number is:"+arr[i]);
					
				}
				
			}

			
	}

}
