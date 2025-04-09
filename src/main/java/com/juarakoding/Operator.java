package com.juarakoding;

public class Operator {
    public static void main(String[] args) {

        double price =  11751;
        double amount =  2;
        double subtotal = amount * price;
        System.out.println(subtotal);

        //modulus %
        System.out.println(12%10);

        int x = 2 ;
        int num1 = 20 * x++; // suffix
        System.out.println(num1);
        System.out.println(num1+x);

        int y = 2 ;
        int num2 = 20 * ++y; // prefix
        System.out.println(num2);

        int result = (10+5)*6 ;
        System.out.println(result);

        int a = 10 ;
        int b = 5 ;
        a += b; // a = a + b;
        System.out.println(a);

        System.out.println(5<5);
        System.out.println(-2<-3);


    }
}
