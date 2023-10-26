package homework18;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        String csvFile = "heroes.csv";
        String line;
        String csvSplitBy = ";";

        List<Hero> heroes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                String name = data[1];
                String gender = data[2];
                String eyeColor = data[3];
                String race = data[4];
                String hairColor = data[5];
                double height = Double.parseDouble(data[6]);
                String publisher = data[7];
                String skinColor = data[8];
                String alignment = data[9];
                int weight = Integer.parseInt(data[10]);
                Hero employee = new Hero(name, gender, eyeColor, race, hairColor, height, publisher, skinColor, alignment, weight);
                heroes.add(employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(Hero.getAvarageHeight(heroes));
        System.out.println(Hero.getHighestHeroName(heroes));
        System.out.println(Hero.getFattestHeroName(heroes));
        System.out.println(Hero.countGenderGroupPerson(heroes));
        System.out.println(Hero.countAlignmentGroupPerson(heroes));
        System.out.println(Hero.get5MostPopularPublisher(heroes));
        System.out.println(Hero.get3MostPopularHairColor(heroes));
        System.out.println(Hero.getMostPopularEyeColor(heroes));
    }
}
