package main.homework4.part1;

public class Human implements Participant {
    public final int run_distance;
    public final int jump_height;

    public Human(int run_distance, int jump_height) {
        this.run_distance = run_distance;
        this.jump_height = jump_height;
    }

    @Override
    public boolean run(int distance) {
        if (distance > run_distance) {
            System.out.println("Person can't run more than " + run_distance);
            return false;
        } else {
            System.out.println("Person runs through " + distance);
            return true;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height > jump_height) {
            System.out.println("Person can't jump higher than " + jump_height);
            return false;
        } else {
            System.out.println("Person jumps " + height);
            return true;
        }
    }
}
