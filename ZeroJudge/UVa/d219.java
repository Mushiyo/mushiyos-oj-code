package UVa;

import java.util.Scanner;
import java.math.BigInteger;

public class d219 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(input.hasNext()){
			BigInteger B = input.nextBigInteger();
			BigInteger P = input.nextBigInteger();
			BigInteger M = input.nextBigInteger();
			
			System.out.println(B.modPow(P, M));						
		}
	}

}
