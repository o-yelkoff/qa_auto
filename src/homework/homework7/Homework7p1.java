package homework.homework7;

import java.util.Scanner;

public class Homework7p1 {

    public static double[] arrayAfterDividing(Integer[] numberArray, double dividing) throws DividingOnZeroException {
        if (dividing == 0) {
            throw new DividingOnZeroException();
        }
        double[] dividingArrey = new double[numberArray.length];
        for (int i = 0; i < numberArray.length; i++) {
            dividingArrey[i] = numberArray[i] / dividing;
        }
        return dividingArrey;
    }

    public static void main(String[] args) {
        Scanner newScaner = new Scanner(System.in);
        double dividing = newScaner.nextDouble();
        Integer[] numberArray;
        numberArray = new Integer[]{4, 9, 15, 26, 37};

        try {
            double[] result = arrayAfterDividing(numberArray, dividing);
            for (double d : result) {
                System.out.println(d);
            }
        } catch (DividingOnZeroException exp) {
            System.out.println("User, entered not valid value. Error from server: " + exp.getMessage());
            System.out.println("Stacktrace: ");
            exp.printStackTrace();
        }
    }
}

