package part1;

public class Cat implements Participant {
    public final int RUN_DISTANCE;
    public final int JUMP_HEIGHT;

    public Cat(int RUN_DISTANCE, int JUMP_HEIGHT) {
        this.RUN_DISTANCE = RUN_DISTANCE;
        this.JUMP_HEIGHT = JUMP_HEIGHT;
    }

    @Override
    public boolean run(int distance) {
        if (distance > RUN_DISTANCE) {
            System.out.println("Cat can't run more than " + RUN_DISTANCE);
            return false;
        } else {
            System.out.println("Cat runs through " + distance);
            return true;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height > JUMP_HEIGHT) {
            System.out.println("Cat can't jump higher than " + JUMP_HEIGHT);
            return false;
        } else {
            System.out.println("Cat jumps " + height);
            return true;
        }
    }
}
