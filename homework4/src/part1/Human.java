package part1;

public class Human implements Participant {
    public final int RUN_DISTANCE;
    public final int JUMP_HEIGHT;

    public Human(int RUN_DISTANCE, int JUMP_HEIGHT) {
        this.RUN_DISTANCE = RUN_DISTANCE;
        this.JUMP_HEIGHT = JUMP_HEIGHT;
    }

    @Override
    public boolean run(int distance) {
        if (distance > RUN_DISTANCE) {
            System.out.println("Person can't run more than " + RUN_DISTANCE);
            return false;
        } else {
            System.out.println("Person runs through " + distance);
            return true;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height > JUMP_HEIGHT) {
            System.out.println("Person can't jump higher than " + JUMP_HEIGHT);
            return false;
        } else {
            System.out.println("Person jumps " + height);
            return true;
        }
    }
}
