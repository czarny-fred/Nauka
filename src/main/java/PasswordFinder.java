import java.util.Scanner;


public class PasswordFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        boolean PasswordRun = false;
        String passwordAdd1 = "nic";
        String passwordAdd2 = "nic";
        String passwordAdd3 = "nic";

        String passwordAddName1 = "nic";
        String passwordAddName2 = "nic";
        String passwordAddName3 = "nic";


        boolean AgeCheckerRun = false;
        int Age = 0;
        System.out.print("HI, WHAT'S YOUR NAME?");
        String HI = sc.nextLine();
        System.out.print("HI " + HI);

        System.out.println("set your user name and password: ");
        String user = sc.next();
        String password = sc.next();
        System.out.println("user name: " + user);
        System.out.println("password: " + password);


        boolean run = true;
        while (run) {
            System.out.println("""
                    IT's your menu
                    1.Password finder
                    2.AgeChecker
                    3.Comment
                    4.QUIT""");
            int choice = sc.nextInt();

            if (choice == 1) {
                PasswordRun = true;
                while (PasswordRun) {
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
                            PasswordRun = false;
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
            if (choice == 2) {
                AgeCheckerRun = true;
                while (AgeCheckerRun) {
                    System.out.println("Enter your age: ");
                    Age = sc.nextInt();
                    if (Age < 18) {
                        System.out.println("""
                                    you're too young to:
                                        drink alcohol
                                        drive a car
                                        get a job
                                """);
                    }
                    if (Age > 18) {
                        System.out.println("""
                                    you're enough old to:
                                        drink alcohol
                                        drive a car
                                        get a job
                                        do whatever you want
                                """);
                    }
                    if  (Age == 1210) {
                        System.out.println("do you want to quit AgeChecker?");
                        String quit = sc.next();
                        if (quit.equals("yes")) {
                            AgeCheckerRun = false;
                        }
                        else if (quit.equals("no")) {
                            System.out.println("nice");
                        }
                    }
                }
            }
        }
    }
}
