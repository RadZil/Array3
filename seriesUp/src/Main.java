//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int[] seriesUp(int n){
        int[] arr = new int[n*(n + 1)/2];

        int currentIndex = 0;
        int currentMax = 1;

        while (currentIndex != (n*(n + 1)/2)){
            for (int i = 1; i < currentMax; i++) {
                arr[currentIndex] = i;
                currentIndex++;
            }
            currentMax+=1;
        }

        return arr;
    }

    public static void main(String[] args) {

    }
}