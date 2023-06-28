package homework.homework6;

import java.util.Arrays;
import java.lang.Math;

public class part1 {
    public static int arrayTopValue(int[] numberArray) {

        int value1 = ((numberArray[0] - numberArray[1]));
        int value2 = ((numberArray[0] - numberArray[2]));
        int value3 = ((numberArray[0] - numberArray[3]));

        int valueInModule1 = Math.abs(value1);
        int valueInModule2 = Math.abs(value2);
        int valueInModule3 = Math.abs(value3);

        int arrayResult1 = Math.min(valueInModule1, valueInModule2);
        int arrayResult2 = Math.min(valueInModule2, valueInModule3);
        int arrayResult = Math.min(arrayResult1, arrayResult2);
        System.out.println(arrayResult);
        return arrayResult;
    }

    public static void main(String[] args) {
        int[] numberArray = {3, 29, 8, 11};
        arrayTopValue(numberArray);
    }
}