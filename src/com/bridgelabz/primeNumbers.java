package com.bridgelabz;
import java.util.Scanner;
public class primeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println(" Range of 0 to 1000 primeNumber is:");
        int start = 0;
        int stop = 1000;
        for(int i =0; i<=1000; i++) {
            if (isprime(i))
                System.out.println(i);

        }
    }
    private static boolean isprime(int number) {
        int count =0;
        if(number < 2)
            return false;
        for (int i = 2; i<number; i++) {
            if(number % i == 0)
                return false;

        }
        return true;
    }
}
