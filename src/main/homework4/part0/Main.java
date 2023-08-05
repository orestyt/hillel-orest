package main.homework4.part0;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Figure> figures = new ArrayList<Figure>();
        Triangle triangle1 = new Triangle(2,4);
        Circle circle1 = new Circle(5);
        figures.add(triangle1);
        figures.add(circle1);
        figureArea(figures);
    }

    public static void figureArea(List<Figure> figures)  {
        double sum = 0;
        for (int i = 0; i < figures.size(); i++) {
            sum =+figures.get(i).area();
        }
        System.out.println(sum);
    }

}
