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
}
