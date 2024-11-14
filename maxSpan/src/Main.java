//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Arrays;

public class Main {
    public static int maxSpan(int[] nums) {
        if (nums.length < 1) return 0;
        int max = 1;

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    if ((j - i + 1) > max){
                        max = j - i + 1;
                    }
                }
            }
        }

        return max;

    }


    public static void main(String[] args) {
        System.out.printf("maxSpan %d \n", maxSpan(new int[]{1, 2, 3, 4, 5}));

    }
}