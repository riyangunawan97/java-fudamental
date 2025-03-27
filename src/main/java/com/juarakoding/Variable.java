package com.juarakoding;
import java.awt.*;

public class Variable {
    public static void main(String[] args) {
        byte rating = 127;
        short stock = 1000;

        char level = 'A';

        String path = "C:\\Users\\Riyan\\Downloads\\ae86.jpg";
        System.out.println(path.toUpperCase());


        boolean isStockAvaiable = false;

        // implementasi variable ke account / users
        String firstName = "Juara";
        String lastName = "Koding";
        String address = "Jakarta";
        boolean isLogin = true;
        boolean isActive = true;

        //casting implicit

        int price = 100000000;
        long total = 3000000000L+ price;
        System.out.println(total);
        int intLevel = level;
        System.out.println(intLevel);

        //casting explicit
        long l = 9222228998000000L;
        int i = (int) l;
        System.out.println(i);

        //passing by value
        int umur = 81;
        int duplikatUmur = umur;
        duplikatUmur = 1308;

        System.out.println(umur);
        System.out.println(duplikatUmur);

        //passing by reference

        Rectangle kotak = new Rectangle(20, 30);
        Rectangle duplikatKotak = kotak;
        duplikatKotak.setSize(80,90);

        System.out.println(kotak.getSize());
        System.out.println(duplikatKotak.getSize());


    }
}
