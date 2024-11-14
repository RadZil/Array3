//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Arrays;

public class Main {

    public static int[] fix34(int[] nums) {
        int n = nums.length;
        int[] result = nums.clone();
        int[] fourindexes = new int[n];
        int fourCount = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 4) {
                fourindexes[fourCount++] = i;
            }
        }

        int fourIndex = 0;


        for (int i = 0; i < n - 1; i++) {
            if (result[i] == 3) {

                if (result[i + 1] != 4) {
                    int temp = result[i + 1];
                    result[i + 1] = 4;
                    result[fourindexes[fourIndex]] = temp;
                    fourIndex++;
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {

        System.out.printf("fix34 %s\n", Arrays.toString(fix34(new int[]{1, 3, 1, 4, 4, 3, 1})));

    }
}