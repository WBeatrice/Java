package Lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task {
    // Реализуйте структуру телефонной книги с помощью HashMap.
    // Программа также должна учитывать, что во входной структуре будут
    // повторяющиеся имена с разными телефонами, их необходимо считать,
    // как одного человека с разными телефонами.
    // Вывод должен быть отсортирован по убыванию числа телефонов.

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        AddingAPhoneNumber("Ivan", 123, bookPhone);
        AddingAPhoneNumber("Kate", 1234, bookPhone);
        AddingAPhoneNumber("Vlad", 546585, bookPhone);
        AddingAPhoneNumber("Ivan", 8956477, bookPhone);
        AddingAPhoneNumber("Vlad", 12356233, bookPhone);
        AddingAPhoneNumber("Ivan", 787897, bookPhone);
        PrintPhoneList(bookPhone);
    }

    public static void AddingAPhoneNumber(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void PrintPhoneList(Map<String, ArrayList<Integer>> map) {
        for (var item : map.entrySet()) {
            String phones = "";
            for (int el : item.getValue()) {
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);

        }
    }

}
