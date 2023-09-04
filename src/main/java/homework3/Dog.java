package homework3;

public class Dog  extends Animal{
    private static int counter;
    public Dog(String name) {
        super(name);
        counter++;
    }

    @Override
    public void run(int lenght) {
        if(lenght <= 500 && lenght >=0) System.out.println(super.name + " ran " + lenght + " meters");
        else System.out.println("Dog can't run that");
    }

    @Override
    public void swim(int lenght) {
        if(lenght <= 10 && lenght >=0) System.out.println(super.name + " swam " + lenght + " meters");
        else System.out.println("Dog can't swim that");
    }

    public static int getCounter(){
        return counter;
    }
}
