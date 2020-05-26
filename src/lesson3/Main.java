package lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.addAll(Arrays.asList("торт", "дом", "кошка", "кофе", "чай", "стул", "стол", "торт", "чашка", "ложка", "торт", "кошка", "окно"));
        System.out.println(stringList);

        HashMap<String, Integer> hmap = new HashMap<>();
        for (String a : stringList) {
            hmap.put(a, hmap.getOrDefault(a, 0) + 1);
        }
        System.out.println(hmap);

        Phone iBook = new Phone();
        iBook.add("Пушкин", 123456789L);
        iBook.add("Лермонтов", 987456123L);
        iBook.add("Некрасов", 147852369L);
        iBook.add("Пушкин", 369852147L);
        iBook.add("Гоголь", 159753654852L);

        System.out.println("Телефон №: " + iBook.get("Пушкин"));
    }
}
