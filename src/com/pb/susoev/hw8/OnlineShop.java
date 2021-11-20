package com.pb.susoev.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        Auth auth =new Auth();
        System.out.println("Registration::: ");
        System.out.println("login: ");
        String login= sc.nextLine();
        System.out.println("password: ");
        String password= sc.nextLine();
        System.out.println("confirmPassword: ");
        String confirmPassword= sc.nextLine();
        try {
            auth.signUp(login,password,confirmPassword);
        } catch (WrongLoginException e) {
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        }

        System.out.println("Login to OnlineShop::: ");
        System.out.println("login: ");
        login= sc.nextLine();
        System.out.println("password: ");
        password= sc.nextLine();
        try {
            if(auth.signIn(login, password)){
                System.out.println("Success");
            }else{
                System.out.println("Failure");
            }
        } catch (WrongLoginException e) {
            e.printStackTrace();
        }


    }
}