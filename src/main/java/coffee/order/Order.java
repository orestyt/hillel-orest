package coffee.order;

import lombok.Getter;

import java.util.concurrent.atomic.AtomicInteger;

@Getter
public class Order {
    private static final AtomicInteger idCounter = new AtomicInteger(1);
    public final int id;
    private final String name;

    public Order(String name) {
        this.name = name;
        this.id = idCounter.getAndIncrement();
    }
}
