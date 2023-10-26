package homework18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    private final List<Hero> heroes = new ArrayList<>();

    @BeforeEach
    void setUp() {
        Hero hero1 = new Hero("A-Bomb", "Male", "yellow", "Human", "No Hair", 203, "Marvel Comics", "-", "good", 441);
        Hero hero2 = new Hero("Abin Sur", "Woman", "greed", "orc", "No Hair", 3, "DC", "yes", "good", 41);
        Hero hero3 = new Hero("B-Bomb", "-", "yellow", "Human", "Brown", 3, "-", "yes", "evil", 51);
        Hero hero4 = new Hero("C-Bomb", "-", "yellow", "Human", "Dark", 3, "Marvel Comics", "no", "evil", 31);
        Hero hero5 = new Hero("D-Bomb", "Male", "yellow", "Human", "Dark", 3, "Marvel Comics", "-", "good", 20);
        heroes.add(hero1);
        heroes.add(hero3);
        heroes.add(hero2);
        heroes.add(hero4);
        heroes.add(hero5);
    }

    @Test
    void shouldGetAvarageHeight() {
        double average = Hero.getAvarageHeight(heroes);
        assertEquals(average, 43);

    }

    @Test
    void shouldGetHighestHeroName() {
        String name = Hero.getHighestHeroName(heroes);
        assertEquals(name, "Optional[A-Bomb]");
    }

    @Test
    void shouldGetFattestHeroName() {
        String name = Hero.getFattestHeroName(heroes);
        assertEquals(name, "Optional[A-Bomb]");
    }

    @Test
    void shouldCountGenderGroupPerson() {
        Map<String, Long> genderGroup = Hero.countGenderGroupPerson(heroes);
        Map<String, Long> shouldGenderGroup = new HashMap<>();
        shouldGenderGroup.put("Male", 2L);
        shouldGenderGroup.put("-", 2L);
        shouldGenderGroup.put("Woman", 1L);
        assertEquals(shouldGenderGroup, genderGroup);
    }

    @Test
    void shouldCountAlignmentGroupPerson() {
        Map<String, Long> alignmentGroup = Hero.countAlignmentGroupPerson(heroes);
        Map<String, Long> shouldAlignmentGroup = new HashMap<>();
        shouldAlignmentGroup.put("good", 3L);
        shouldAlignmentGroup.put("evil", 2L);
        assertEquals(shouldAlignmentGroup, alignmentGroup);
    }

    @Test
    void shouldGet5MostPopularPublisher() {
        List<String> mostPopularPubliser = Hero.get5MostPopularPublisher(heroes);
        List<String> shouldMostPopularPubliser = new ArrayList<>();
        shouldMostPopularPubliser.add("Marvel Comics");
        shouldMostPopularPubliser.add("-");
        shouldMostPopularPubliser.add("DC");
        assertEquals(shouldMostPopularPubliser, mostPopularPubliser);
    }

    @Test
    void shouldGet3MostPopularHairColor() {
        List<String> mostPopularHairColor = Hero.get3MostPopularHairColor(heroes);
        List<String> shouldMostPopularHairColor = new ArrayList<>();
        shouldMostPopularHairColor.add("No Hair");
        shouldMostPopularHairColor.add("Dark");
        shouldMostPopularHairColor.add("Brown");
        assertEquals(shouldMostPopularHairColor, mostPopularHairColor);
    }

    @Test
    void shouldGetMostPopularEyeColor() {
        List<String> mostPopularEyeColor = Hero.getMostPopularEyeColor(heroes);
        List<String> shouldMostPopularEyeColor = new ArrayList<>();
        shouldMostPopularEyeColor.add("yellow");
        assertEquals(shouldMostPopularEyeColor, mostPopularEyeColor);
    }
}