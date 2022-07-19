package com.bridzelab.evenodd;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //Make scanner obj
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();  // Input int

        if(num%2==0){
            System.out.println(num+" is an even number");
        }else
            System.out.println(num+" is an odd number");
        }

}
