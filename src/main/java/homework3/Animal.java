package homework3;

public class Animal {
    String name;

    private static int counter;

    public Animal(String name) {
        this.name = name;
        counter++;
    }

    public void run(int lenght){
        System.out.println(this.name + " ran " + lenght +" meters");
    }

    public void swim(int lenght){
        System.out.println(this.name + " ran " + lenght +" meters");
    }
    public static int getCounter(){
        return counter;
    }
}
