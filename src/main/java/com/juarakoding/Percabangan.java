package com.juarakoding;

import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        int checkNum = 5;
        if(checkNum%2 > 0 ){
            System.out.println("checkNum ganjil" );
        }else{
            System.out.println("checkNum genap" );
        }

        String userId = "admin";
        String password = "123";
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Username : ");
        String checkUserId = myObj.nextLine();
        System.out.print("Enter Password : ");
        String checkUserPassword = myObj.nextLine();

        if(checkUserId.equals(userId) && checkUserPassword.equals(password)){
            int randomNum = (int)(Math.random() * 1001);
            System.out.println(randomNum);
        }else{
            System.out.println("id atau password salah");
        }

        myObj.close();


    }
}
