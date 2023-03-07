package de.demo.castingtobytetest;

public class Main {

	public static void main(String[] args) {
		/*
		 * The purpose of this tiny project is to experiment with the
		 * explicit type casting (to byte) in Java in order to understand how it works.
		 * 
		 * A bit has two possible values: 0 and 1.
		 * 
		 * A byte is 8 bits.
		 * Thus a byte can hold a value from -128 to 127
		 * 
		 * Some math: 2^8 = 256
		 * 			  256 / 2 = 128
		 * 
		 * 			  The range includes 0 that's why we take one 
		 *            from the positive side.
		 *            Thus, the range is: -128 to 127
		 *  
		 */
		
		out("Explicit casting ");
		out( "Casting 130 results in " + (byte) 130); //outputs -126
		out( "Casting 256 results in " + (byte) 256); //outputs 0
		out( "Casting 257 results in " + (byte) 257); //outputs 1
		out( "Casting -257 results in " + (byte) -257); //outputs -1
		out( "Casting -130 results in " + (byte) -130); //outputs 126

		out( "Casting -3,500,000,005 (of type long) results in " + (byte) -3_500_000_005L); //outputs -5
		out( "Casting max value of long results in " + (byte) Long.MAX_VALUE); //outputs -1
		
		out("\nMax value of type long % 256 is " + Long.MAX_VALUE % 256); //outputs 255
		out("type casting it to byte results in " + (byte) Long.MAX_VALUE % 256); //outputs -1
		
		
		/*
		 * Based on this empirical test, it appears that the explicit casting of bytes
		 * functions as follows:
		 * 
		 * a) if the value to be assigned (let's say, x) is in the range from -256 to -128,
		 * then the result of casting will be (x + 256)
		 * 
		 * b) if x is in the range from 127 to 256,
		 * then the result of casting will be (x - 256)
		 * 
		 * c) if x is < -256 or x > 256, then output will be x % 256
		 * 
		 * 			Now, a special case: if the output after modulus is in the range
		 * 			from -256 to -128 or 127 to 256, then the steps a) or b) a repeated
		 * 			respectively
		 */
		

	}
	
	private static void out(String string) {
		System.out.println(string);
	}

}
