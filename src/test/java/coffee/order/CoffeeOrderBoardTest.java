package coffee.order;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeOrderBoardTest {
    private final CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

    @Test
    void shouldAdd() {
        coffeeOrderBoard.add("Vlad");
        coffeeOrderBoard.add("Nika");
        List<Order> shouldOrderList = coffeeOrderBoard.getOrderList();
        Order order1 = shouldOrderList.get(0);
        assertEquals("Vlad", order1.getName());
    }

    @Test
    void shouldDeliver() {
        coffeeOrderBoard.add("Vlad");
        coffeeOrderBoard.add("Nika");
        List<Order> shouldOrderList = coffeeOrderBoard.getOrderList();
        coffeeOrderBoard.deliver();
        Order order1 = shouldOrderList.get(0);
        assertEquals("Nika", order1.getName());
    }
}