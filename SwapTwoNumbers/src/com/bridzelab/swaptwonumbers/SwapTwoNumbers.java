package com.bridzelab.swaptwonumbers;
import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Make Scanner obj
        System.out.println("Enter the two numbers to swap : ");
        int x = scanner.nextInt();  // int input
        int y = scanner.nextInt();
        int swap;

        System.out.println("Numbers before swapping are: "+ x + " "+ y);

        swap = x;
        x=y;
        y=swap;

        System.out.println("Numbers after swapping are: "+ x + " "+ y);

        }

}
