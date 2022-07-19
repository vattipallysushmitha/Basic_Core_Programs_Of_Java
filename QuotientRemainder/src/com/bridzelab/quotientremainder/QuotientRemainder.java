package com.bridzelab.quotientremainder;
import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  // Make scanner obj
        System.out.println("Enter the Dividend and Divisor: ");
        int dividend = scanner.nextInt(); // Int input
        int divisor = scanner.nextInt();

        int quotient = dividend/divisor; // To find quotient
        int remainder = dividend%divisor; // To find Remainder

        System.out.println("The Quotient is = "+quotient+" and the Remainder is = "+remainder);
        }

}
