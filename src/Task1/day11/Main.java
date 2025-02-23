package Task1.day11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int temp = Math.abs(n);

        for (; temp > 0 ;temp/=10) {
            count++;
        }
        System.out.println(count);
    }
}
