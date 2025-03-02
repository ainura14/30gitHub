package Task1.day28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String name = scanner.nextLine();
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println(firstName + " " + lastName + " " + age + " " + name);
    }
}
