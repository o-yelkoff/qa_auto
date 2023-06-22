package homework;

public class HomeWork3 {
    static String wordGreatLength(String word1, String word2, String word3) {
        int wordlenght1 = word1.length();
        int wordlenght2 = word2.length();
        int wordlenght3 = word3.length();

        if ((wordlenght1 > wordlenght2) && (wordlenght1 > wordlenght3)) {
            return word1;
        } else if ((wordlenght2 > wordlenght1) && (wordlenght2 > wordlenght3)) {
            return word2;
        } else {
            return word3;
        }
    }

    public static void main(String args[]) {
        String word1 = "Rolls-Royce";
        String word2 = "Maserati";
        String word3 = "Porsche";
        System.out.println(wordGreatLength(word1, word2, word3));
    }
}
