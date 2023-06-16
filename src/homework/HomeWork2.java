package homework;

public class HomeWork2 {
    static int findSum(String str1, String str2) {
        int wordlenght = str1.length();
        int wordlenght1 = str2.length();
        int wordsum = wordlenght + wordlenght1;
        System.out.println(wordsum);
        return wordsum;
    }

    static boolean findSum(long l) {
        if (l > 0) {
            System.out.println("Number " + l + " > 0");
            return true;
        } else {
            System.out.println("Number " + l + " <= 0");
            return false;
        }
    }

    static int findSum(int inputnum) {
        int sum = 0;
        while (inputnum != 0) {
            sum = sum + inputnum % 10;
            inputnum = inputnum / 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        int inputnum = 348;
        long l = inputnum;
        String str1 = "Mickey";
        String str2 = "Mouse";
        System.out.println(findSum(inputnum));
        findSum(str1,str2);
        findSum(l);
    }
}
