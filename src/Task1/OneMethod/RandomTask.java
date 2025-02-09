package Task1.OneMethod;

import java.util.Random;

public class RandomTask {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        Random random = new Random();
        a = random.nextInt(10);
        b = random.nextInt(10);
        c= random.nextInt(10);
        System.out.println(a + " " + b + " " + c);
        System.out.println(a + b + c);
        if(a > b){
            System.out.println(a);
        }else if (c > b) {
            System.out.println(c);
        }else{
            System.out.println(b);
        }

    }
}
