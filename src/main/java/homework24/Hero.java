package homework24;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

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
}
