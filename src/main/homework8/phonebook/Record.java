package main.homework8.phonebook;

public class Record {
    private final String name;
    private final Number number;

    public String getName() {
        return name;
    }

    public Number getNumber() {
        return number;
    }

    public Record(String name, Number number) {
        this.name = name;
        this.number = number;
    }
}
