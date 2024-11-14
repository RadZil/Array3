//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Arrays;

public class Main {

    public static int[] squareUp(int n){
        int[] result = new int[n * n];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                int index = (i * n - 1) - j;
                result[index] = j + 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {


        System.out.printf("squareUp %s\n", Arrays.toString(squareUp(3)));
    }
}