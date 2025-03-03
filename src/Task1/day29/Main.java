package Task1.day29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            sum += input.charAt(i) - '0';
        }
        System.out.println(sum);
        scanner.close();
    }
}
