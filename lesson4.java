package GB_4;

import java.util.*;

public class lesson4 {
    public static void main(String[] args) {
        String[] words = {"luck", "son", "girl", "boy", "fish", "boy", "banan", "fish", "golf", "boy"};

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
        map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        Phonebook pb = new Phonebook();

        pb.add("Ivanov", "8906");
        pb.add("Sidorov", "8915");
        pb.add("Sidorov", "8921");

        System.out.println(pb.get("Sidorov"));
    }
}
