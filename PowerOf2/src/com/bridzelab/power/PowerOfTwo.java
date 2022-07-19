package com.bridzelab.power;
import java.util.Scanner;
public class PowerOfTwo {

	public static void main(String[] args) {
		int N = power();

        while( N < 0 || N > 31){
            System.out.println("Enter N value between 0 and 31");
            N = power();
        }
        for(int i=0;i<=N;i++) {
            System.out.println("2 power "+ i +" is: " + Math.pow(2, i));
        }
    }
    public static int power(){
        Scanner scanner = new Scanner(System.in);  // Make scanner Obj
        System.out.println("Enter the value of N: ");
        return scanner.nextInt();

    }

    }
