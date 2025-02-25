package Task1.day23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String weather = new String();
        weather = "Today id cloudly weather";
        System.out.println(weather);

        int grad = 20;
        System.out.println("temperature" + grad);

        System.out.println("Please enter your weather here");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        switch (num) {
            case 20:
                System.out.println("The season is temperature");
                break;
            case 30:
                System.out.println("The season is the most temperature");
                break;
            case 10:
                System.out.println("The season is less temperature");
        }
    }
}
