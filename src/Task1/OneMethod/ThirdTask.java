package Task1.OneMethod;

import java.util.Scanner;

public class ThirdTask {
    static int a;
    static  int b;
    static  int c;

    public void sum(int a, int b, int c){
        int sum = a + b + c;
        System.out.println(sum);
    }

    public int product(int a, int b, int c){
        return a * b * c;
    }

    public int avg(int a, int b, int c){
        return (a + b + c) / 3;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number: ");
         a = scanner.nextInt();
        System.out.println("Second number: ");
        b = scanner.nextInt();
        System.out.println("Third number: ");
        c = scanner.nextInt();

        ThirdTask thirdTask = new ThirdTask();
        thirdTask.sum(a, b, c);
        System.out.println(thirdTask.product(a, b, c));
        System.out.println(thirdTask.avg(a, b, c));

    }
}
