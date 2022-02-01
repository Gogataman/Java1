package qa.automation;

import java.util.Scanner;

public class MyFirstJava {

    public static void main(String[] args) {

        System.out.println("Enter your name: ");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println("Enter your hobby: ");

        String hobby = scanner.nextLine();

        System.out.println("Your name is: " + name +
                "\nYour hobby is: " + hobby);
    }
}