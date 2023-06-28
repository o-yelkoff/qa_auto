package homework.homework6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Books {

    public static void main(String[] args) {
        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        ArrayList<String> bookname = new ArrayList<String>();
        bookname.add("Володар кілець");
        map.put("1", bookname);

        bookname = new ArrayList<String>();
        bookname.add("У пошуках утраченого часу");
        map.put("2", bookname);

        bookname = new ArrayList<String>();
        bookname.add("Маленький принц");
        map.put("3", bookname);

        bookname = new ArrayList<String>();
        bookname.add("Король Лір");
        map.put("4", bookname);

        bookname = new ArrayList<String>();
        bookname.add("Гаррі Поттер");
        map.put("5", bookname);

        String key = "3";
        System.out.println(map.get(key));

    }
}
