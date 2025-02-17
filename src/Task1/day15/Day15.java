package Task1.day15;

import java.util.Arrays;
import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {
        Day15 day15 = new Day15();
        int[] nums = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println("day15.solution(nums) = " + day15.solution(nums));
    }
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }
}
