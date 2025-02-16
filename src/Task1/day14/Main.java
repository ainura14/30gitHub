package Task1.day14;

import java.util.Arrays;

public class Main {
    public int[] numbersDesc(int[] numbers) {
        Arrays.sort(numbers);
        int[] sortedArray = new int[numbers.length];
        int index = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            sortedArray[index++] = numbers[i];
        }
        return sortedArray;
    }
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(Arrays.toString(main.numbersDesc(new int[]{1, 2, 3, 4, 5})));
    }
}
