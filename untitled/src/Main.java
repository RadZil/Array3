//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Arrays;

public class Main {


    public static boolean linearIn(int[] outer, int[] inner){
        int tempIndex = 0;
        int needToFind = inner.length;
        for (int i = 0; i < inner.length; i++) {
            for (int j = 0; j < outer.length; j++) {
                if(inner[i] == outer[j]){
                    needToFind--;
                    break;
                }
            }
        }
        if (needToFind <= 0){
            return true;
        }else{
            return false;
        }


    }

    public static void main(String[] args) {


        System.out.printf("linearIn %b",linearIn(new int[]{1,2,4,6},new int[]{2,3,4}));

    }
}