package homework.homework7;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homewrok7p2 {

    public static void main(String[] args) {
        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("+380971569995");
        phoneNumbers.add("+180971569995");
        phoneNumbers.add("+38097156999555");
        phoneNumbers.add("80971569995");

        String regex = "\\+380[0-9]{9}";
        Pattern pattern = Pattern.compile(regex);
        for (String numbers : phoneNumbers) {
            Matcher matcher = pattern.matcher(numbers);
            System.out.println(numbers + " : " + matcher.matches());
        }
    }
}
