package Task1.day19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName;
        String fullName;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your username: ");
        userName = input.nextLine();
        System.out.print("Enter your full name: ");
        fullName = input.nextLine();
        System.out.print(userName + " " + fullName);
    }
}
