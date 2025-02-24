package Task1.day22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String gender = scanner.nextLine();
        scanner.close();
        System.out.println(name + " " + age + " " + gender);
    }
}
