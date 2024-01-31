package org.tnsif.exception;

public class NestedTryException {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x,y,z;
			x=5;y=0;
			try {
				 z = divide(x,y);
			}catch(ArithmeticException ex) {
				System.err.println("Arithmetic Exception occured " + ex.getMessage());
			}
		}catch(Exception ex) {
			System.err.println("Arithmetic Exception occured " + ex.getMessage());
		}

	}
	public static int divide(int x, int y) {
		int z;
		z = x/y;
		return z;
		
	}


}
