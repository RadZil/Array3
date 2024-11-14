//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Arrays;

public class Main {
    public static boolean canBalance(int[] nums){
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int sum1 = 0;
            int sum2 = 0;

            for (int j = 0; j < i; j++) {
                sum1 += nums[j];
            }

            for (int j = i; j < n; j++) {
                sum2 += nums[j];
            }


            if (sum1 == sum2) {
                return true;
            }
        }

        return false;

    }


    public static void main(String[] args) {


        System.out.printf("canBalance %b",canBalance(new int[]{1, 3, 1, 4, 4, 3, 1}));

    }
}