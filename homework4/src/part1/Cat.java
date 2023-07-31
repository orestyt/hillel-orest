package part1;

public class Cat implements Participant {
    public final int run_distance;
    public final int jump_height;

    public Cat(int run_distance, int jump_height) {
        this.run_distance = run_distance;
        this.jump_height = jump_height;
    }

    @Override
    public boolean run(int distance) {
        if (distance > run_distance) {
            System.out.println("Cat can't run more than " + run_distance);
            return false;
        } else {
            System.out.println("Cat runs through " + distance);
            return true;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height > jump_height) {
            System.out.println("Cat can't jump higher than " + jump_height);
            return false;
        } else {
            System.out.println("Cat jumps " + height);
            return true;
        }
    }
}
