package Task1.day_10;

import java.util.Random;
import java.util.Scanner;

public class RandomTask {
    public static void main(String[] args) {
        Random random = new Random();
        int massiv[] = new int[20];
        for (int i = 0; i < 20; i++) {
            massiv[i] = random.nextInt(10);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        boolean flag = false;
        for (int i = 0; i < massiv.length; i++) {
            if(massiv[i] == num){
                System.out.println(massiv[i]);
                flag = true;
                break;
            }
        }
        if(!flag) {
            System.out.println("Can't find the number ");
        }

    }
}
