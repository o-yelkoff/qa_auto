package homework.homework6;

import java.lang.Math;

public class Part1 {
    public static int arrayTopValue(int[] numberArray) {
        int min = Math.abs(numberArray[1] - numberArray[0]);
        for (int i = 0; i < numberArray.length; i++) {
            for (int j = i + 1; j < numberArray.length; j++) {
                if (Math.abs(numberArray[j] - numberArray[i]) < min) {
                    min = Math.abs(numberArray[j] - numberArray[i]);
                }
            }
        }
        System.out.println(min);
        return min;
    }

    public static void main(String[] args) {
        int[] numberArray = {5, 20, 7, 11};
        arrayTopValue(numberArray);
    }
}


