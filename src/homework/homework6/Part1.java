package homework.homework6;

import java.lang.Math;

public class Part1 {
    public static int arrayTopValue(int[] numberArray) {

        int value1 = Math.abs((numberArray[0] - numberArray[1]));
        int value2 = Math.abs((numberArray[0] - numberArray[2]));
        int value3 = Math.abs((numberArray[0] - numberArray[3]));

        int arrayResult = Math.min(
                Math.min(value1, value2),
                Math.min(value2, value3));

        System.out.println(arrayResult);
        return arrayResult;
    }

    public static void main(String[] args) {
        int[] numberArray = {5, 20, 7, 11};
        arrayTopValue(numberArray);
    }
}