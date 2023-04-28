package com.bridgelabz;

public class primeNumber {
    public static void main(String[] args) {
        int i=0;
        int num=0;
        String primeNumbers = " ";
        for(i= 0;i<= 1000;i++) {
            int counter =0;
            for(num = i; num>=1; num--) {
                if(i % num == 0) {
                    counter = counter +1;

                }

            }
            if(counter == 2) {
                primeNumbers = primeNumbers + 1 + " ";
            }

        }
        System.out.println(" prime Numbers  from 0 to 1000 are :");
        System .out.print("prime numbers");
    }


}
