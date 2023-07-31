package part1;

public class Cat implements Participant {
    public final int run_distance;
    public final int jump_height;

    public Cat(int RUN_DISTANCE, int JUMP_HEIGHT) {
        this.run_distance = RUN_DISTANCE;
        this.jump_height = JUMP_HEIGHT;
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
