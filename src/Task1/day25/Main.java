package Task1.day25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, sum = 1;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        for (int i = 1; i < a; i++) {
            sum += sum * i;
        }
        System.out.println(sum);
    }
}
