//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int countClumps(int[] nums){
        int clumps = 0;
        boolean countingClump = false;

        for (int index = 0; index < nums.length - 1; index++) {
            if (nums[index] == nums[index + 1]) {

                countingClump = true;
            } else if (countingClump) {

                clumps++;
                countingClump = false;
            }
        }
        if (countingClump) {
            clumps++;
        }

        return clumps;
    }

    public static void main(String[] args) {
        System.out.println(countClumps(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}