package Task1.day26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        if (words.length == 2) {
            System.out.println(words[1]);
        }else{
            System.out.println(words[0]);
        }
    }
}
