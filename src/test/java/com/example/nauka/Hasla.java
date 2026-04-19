package com.example.nauka;
import java.util.Scanner;

public class Hasla {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String passwordAdd1 = "nic";
        String passwordAdd2 = "nic";
        String passwordAdd3 = "nic";

        String passwordAddName1 = "nic";
        String passwordAddName2 = "nic";
        String passwordAddName3 = "nic";


        System.out.println("set your user name and password: ");
        String user = sc.next();
        String password = sc.next();
        System.out.println("user name: " + user);
        System.out.println("password: " + password);


        boolean run = true;
        while (run) {

            System.out.println("""
                1. add password
                2. add password
                3. change account
                4. quit
                5. find your password
                """);
            String move = sc.next();
                if (move.equals("1")) {
                    System.out.println("Enter your user name: ");
                    String checkaccount = sc.next();
                    System.out.println("Enter your user password: ");
                    String checkpassword = sc.next();
                    if (checkaccount.equals(user) && checkpassword.equals(password)) {
                        System.out.println("You have successfully log in");
                        System.out.println("password add:");
                        passwordAdd1 = sc.next();
                        System.out.println("add name:");
                        passwordAddName1 = sc.next();
                        System.out.println("you add new password:"+ passwordAddName1);

                    }
                }
                if (move.equals("2")) {
                    System.out.println("Enter your user name: ");
                    String checkaccount = sc.next();
                    System.out.println("Enter your user password: ");
                    String checkpassword = sc.next();
                    if (checkaccount.equals(user) && checkpassword.equals(password)) {
                        System.out.println("You have successfully log in");
                        System.out.println("password add:");
                        passwordAdd2 = sc.next();
                        System.out.println("add name:");
                        passwordAddName2 = sc.next();
                        System.out.println("you add new password:"+ passwordAddName2);
                    }
                }
                if (move.equals("3")) {
                    System.out.println("Enter your user name: ");
                    String checkaccount = sc.next();
                    System.out.println("Enter your user password: ");
                    String checkpassword = sc.next();
                    if (checkaccount.equals(user) && checkpassword.equals(password)) {
                        System.out.println("You have successfully log in");
                        System.out.println("add account: ");
                        String AccountAdd = sc.next();
                        System.out.println("you add new account:"+ AccountAdd);
                        System.out.println("add password:");
                        String PasswordAdd = sc.next();
                        System.out.println("you add new password:"+ PasswordAdd);
                        user = AccountAdd;
                        password = PasswordAdd;
                    }
                }
                if  (move.equals("4")) {
                    System.out.println("see u");
                    run = false;
                }
                if  (move.equals("5")) {
                    System.out.println("Enter your password number: ");
                    String FindPassword = sc.next();
                        if (FindPassword.equals("1") || FindPassword.equals(passwordAddName1)) {
                            System.out.println("password number 1: " + passwordAdd1);
                        }
                        if (FindPassword.equals("2") || FindPassword.equals(passwordAddName2)) {
                            System.out.println("password number 2: " + passwordAdd2);
                        }
                        if (FindPassword.equals("3") || FindPassword.equals(passwordAddName3)) {
                            System.out.println("password number 3: " + passwordAdd3);
                        }


                }


                }
        }

    }
