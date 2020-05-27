package lesson3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Phone {
    private HashMap<String, Set<Long>> phoneBook = new HashMap<>();

    public void add(String name, Long phone) {
        Set<Long> tell = phoneBook.getOrDefault(name, new HashSet<>());
        tell.add(phone);
        phoneBook.put(name, tell);
    }

    public Set<Long> get(String name) {
        return phoneBook.get(name);
    }
}
