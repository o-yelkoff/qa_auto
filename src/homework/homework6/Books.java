package homework.homework6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Books {
    public static HashMap<Integer, String> findBook(List<String> bookName) {
        return IntStream.range(0, bookName.size())
                .boxed()
                .collect(Collectors.toMap(i -> i, bookName::get, (oldValue, newValue) -> newValue, HashMap::new));
    }

    public static void main(String[] args) {
        ArrayList<String> bookname = new ArrayList<String>();
        bookname.add(0, "Володар кілець");
        bookname.add(1, "У пошуках утраченого часу");
        bookname.add(2, "Маленький принц");
        bookname.add(3, "Король Лір");
        bookname.add(4, "Гаррі Поттер");
        HashMap<Integer, String> as = findBook(bookname);
        Integer key = 3;
        System.out.println(as.get(key));
    }
}
