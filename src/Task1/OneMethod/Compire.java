package Task1.OneMethod;

import java.util.Random;
import java.util.Scanner;

public class Compire {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(5);
        System.out.println(a + " a random number!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int b = scanner.nextInt();
        if(a == b){
            System.out.println("a == b");
        }else{
        System.out.println("a != b");
        }
    }
}
