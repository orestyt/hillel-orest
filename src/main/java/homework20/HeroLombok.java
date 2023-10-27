package homework20;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Data
@ToString
public class HeroLombok {
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

    public HeroLombok(String name, String gender, String eyeColor, String race, String hairColor, double height, String publisher, String skinColor, String alignment, int weight) {
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
}
