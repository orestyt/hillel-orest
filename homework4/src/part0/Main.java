package part0;

import part0.Circle;
import part0.Figure;
import part0.Triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
