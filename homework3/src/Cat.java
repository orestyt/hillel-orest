public class Cat extends Animal{
    private static int counter;
    public Cat(String name) {
        super(name);
        counter++;
    }

    @Override
    public void run(int lenght) {
        if(lenght <= 200 && lenght >=0) System.out.println(super.name + " ran " + lenght + " meters");
        else System.out.println("Cat can't run that");
    }

    @Override
    public void swim(int lenght) {
        System.out.println("Cat can't swim");
    }

    public static int getCounter(){
        return counter;
    }
}
