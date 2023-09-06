package homework8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("pineaple");
        stringList.add("apple");
        stringList.add("bird");
        stringList.add("bird");
        stringList.add("pineaple");
        stringList.add("bird");
        System.out.println(findOccurance(stringList));

    }

    public static int countOccurance(List<String> stringList, String str) {
        int count = 0;
        for (String strs :
                stringList) {
            if (str.equals(strs)) count++;
        }
        return count;
    }

    public static <T> List<T> toList(T array[]) {
        List<T> list = Arrays.asList(array);
        return list;
    }

    public static List<Integer> findUnique(List<Integer> unsortedList) {
        List<Integer> sortedList = new ArrayList<>(new LinkedHashSet<>(unsortedList));
        return sortedList;
    }

    public static Map<String, Integer> calcOccurance(List<String> stringList) {
        Map<String, Integer> occuranceMap = new HashMap();
        for (String word : stringList) {
            if (!occuranceMap.containsKey(word)) {
                occuranceMap.put(word, 1);
            } else {
                occuranceMap.put(word, occuranceMap.get(word) + 1);
            }
        }
        return occuranceMap;
    }

    public static StringBuilder findOccurance(List<String> stringList) {
        StringBuilder occuranceString = new StringBuilder("[\n");
        for (String key : calcOccurance(stringList).keySet()) {
            occuranceString.append("{name: \"" + key + "\",occurrence: " + calcOccurance(stringList).get(key) + "},\n");
        }
        occuranceString.delete(occuranceString.length() - 2, occuranceString.length()).append("\n]");
        return occuranceString;
    }
}
