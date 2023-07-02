package homework.homework7;

public class DividingOnZeroException extends Exception {

    DividingOnZeroException() {
        super("Caution! Division by 0 is not possible, please enter another number.");
    }
}
