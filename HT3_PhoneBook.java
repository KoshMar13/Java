package HT.HT3;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class PhoneBook {
    private Map<String, List<String>> book = new HashMap<>();

    public void addPh(String name, String numb) {
        List<String> numbers;
        if (book.containsKey(name)) {
            numbers = book.get(name);

        } else {
            numbers = new ArrayList<>();
        }
        numbers.add(numb);
        book.put(name, numbers);
    }

    public List<String> getPh(String name) {
        return book.get(name);
    }

    public void printPhB() {
        System.out.println(book);
    }

}
