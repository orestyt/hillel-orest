package homework3;

public class hw3{
    public static void main(String[] args){

        Cat cat1 = new Cat("catt");
        cat1.run(210);
        Animal animal1 = new Animal("randomAnimal");
        animal1.run(500);
        Cat cat2 = new Cat("cattdd");
        Cat cat3 = new Cat("catts");
        Cat cat4 = new Cat("cat345");
        System.out.println(Cat.getCounter());
        System.out.println(Animal.getCounter());
        System.out.println(Dog.getCounter());

    }
}
