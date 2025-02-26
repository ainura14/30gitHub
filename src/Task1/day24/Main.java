package Task1.day24;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {10, 21, 34, 45, 23, 1};
        Arrays.sort(nums);
        int large = 0;
        int secondLarge = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > large) {
                large = i;
            }
        }
        System.out.println(nums[large - 1]);

    }
}
