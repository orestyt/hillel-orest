package main.homework4.part1;

public class RunRoad implements Obstacle{
    private final int lenght;

    public RunRoad(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public boolean overcome(Participant participant) {
        return participant.run(lenght);
    }
}
