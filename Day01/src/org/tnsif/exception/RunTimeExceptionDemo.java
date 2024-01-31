package org.tnsif.exception;

public class RunTimeExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int arr[];
		arr = new int[] {1,2,3,4};
		System.out.println(arr[4]);
		
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("The arror message is: " + ex.getMessage()); // get is a inbuilt operation of throwable interface
		}
		System.out.println("End of the program");
		
	}

}
