package homework18;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Hero {
    private int id;

    private String name;

    private String gender;

    private String eyeColor;

    private String race;

    private String hairColor;

    private double height;

    private String publisher;

    private String skinColor;

    private String alignment;

    private int weight;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getRace() {
        return race;
    }

    public String getHairColor() {
        return hairColor;
    }

    public double getHeight() {
        return height;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public String getAlignment() {
        return alignment;
    }

    public int getWeight() {
        return weight;
    }

    public Hero(String name, String gender, String eyeColor, String race, String hairColor, double height, String publisher, String skinColor, String alignment, int weight) {
        this.name = name;
        this.gender = gender;
        this.eyeColor = eyeColor;
        this.race = race;
        this.hairColor = hairColor;
        this.height = height;
        this.publisher = publisher;
        this.skinColor = skinColor;
        this.alignment = alignment;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Hero{" +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", race='" + race + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", height=" + height +
                ", publisher='" + publisher + '\'' +
                ", skinColor='" + skinColor + '\'' +
                ", alignment='" + alignment + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static double getAvarageHeight(List<Hero> heroes) {
        int countHeroes = (int) heroes.stream()
                .filter(hero -> hero.height > 0)
                .count();
        double sumHeroesLenghts = (int) heroes.stream()
                .filter(hero -> hero.height > 0)
                .mapToDouble(hero -> hero.height)
                .sum();
        return sumHeroesLenghts / countHeroes;
    }

    public static String getHighestHeroName(List<Hero> heroes) {
        return heroes.stream()
                .max(Comparator.comparing(Hero::getHeight))
                .map(Hero::getName)
                .toString();
    }

    public static String getFattestHeroName(List<Hero> heroes) {
        return heroes.stream()
                .max(Comparator.comparing(Hero::getWeight))
                .map(hero -> hero.getName())
                .toString();
    }

    public static Map<String, Long> countGenderGroupPerson(List<Hero> heroes) {
        return heroes.stream()
                .collect(Collectors.groupingBy(Hero::getGender, Collectors.counting()));
    }

    public static Map<String, Long> countAlignmentGroupPerson(List<Hero> heroes) {
        return heroes.stream()
                .collect(Collectors.groupingBy(Hero::getAlignment, Collectors.counting()));
    }

    public static List<String> get5MostPopularPublisher(List<Hero> heroes) {
        return heroes.stream()
                .collect(Collectors.groupingBy(Hero::getPublisher, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder()))
                .limit(5)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

    }

    public static List<String> get3MostPopularHairColor(List<Hero> heroes) {
        return heroes.stream()
                .collect(Collectors.groupingBy(Hero::getHairColor, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

    }

    public static List<String> getMostPopularEyeColor(List<Hero> heroes) {
        return heroes.stream()
                .collect(Collectors.groupingBy(Hero::getEyeColor, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder()))
                .limit(1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

    }
}
