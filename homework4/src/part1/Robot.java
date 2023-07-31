package part1;

public class Robot implements Participant {
    public final int RUN_DISTANCE;
    public final int JUMP_HEIGHT;

    public Robot(int RUN_DISTANCE, int JUMP_HEIGHT) {
        this.RUN_DISTANCE = RUN_DISTANCE;
        this.JUMP_HEIGHT = JUMP_HEIGHT;
    }

    @Override
    public boolean run(int distance) {
        if (distance > RUN_DISTANCE) {
            System.out.println("Robot can't run more than " + RUN_DISTANCE);
            return false;
        } else {
            System.out.println("Robot runs through " + distance);
            return true;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height > JUMP_HEIGHT) {
            System.out.println("Robot can't jump higher than " + JUMP_HEIGHT);
            return false;
        } else {
            System.out.println("Robot jumps " + height);
            return true;
        }
    }
}
