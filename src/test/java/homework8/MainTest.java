package homework8;

import homework8.Main;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import static org.junit.jupiter.api.Assertions.*;

class MainTest extends Main {

    @Test
    void shouldCountOccurance() {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("pineaple");
        stringList.add("apple");
        stringList.add("bird");
        stringList.add("bird");
        stringList.add("pineaple");
        stringList.add("bird");
        assertEquals(3, countOccurance(stringList, "bird"));
    }

    @Test
    void shouldToList() {
    //Не розумію як розробити тест на цей метод
    }

    @Test
    void shouldFindUnique() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        integerList.add(4);
        integerList.add(2);
        integerList.add(1);
        integerList.add(2);
        integerList.add(2);
        integerList.add(1);
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        expectedList.add(3);
        expectedList.add(4);
        expectedList.add(2);
        assertArrayEquals(expectedList.toArray(), findUnique(integerList).toArray());

    }

    @Test
    void shouldCalcOccurance() {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("pineaple");
        stringList.add("apple");
        stringList.add("bird");
        stringList.add("bird");
        stringList.add("pineaple");
        stringList.add("bird");
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("apple", 2);
        expectedMap.put("pineaple", 2);
        expectedMap.put("bird", 3);
        assertEquals(expectedMap, calcOccurance(stringList));
    }

    @Test
    void shouldFindOccurance() {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("apple");
        stringList.add("bird");
        StringBuilder expectedString = new StringBuilder("[\n{name: \"apple\",occurrence: 2},\n{name: \"bird\",occurrence: 1}\n]");
        assertEquals(expectedString.toString(), findOccurance(stringList).toString());
    }
}