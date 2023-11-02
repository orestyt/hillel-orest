package coffee.order;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CoffeeOrderBoard {
    private final List<Order> orderList = new ArrayList<>();

    public void add(String name) {
        Order order = new Order(name);
        orderList.add(order);
    }

    public void deliver() {
        for (Order order : orderList) {
            System.out.println(order.getName() + " заберіть замовлення під номером: " + order.getId());
            orderList.remove(order);
            break;
        }
    }

    public void draw() {
        System.out.println("Num  | Name ");
        for (Order order : orderList) {
            System.out.println(order.getId() + " | " + order.getName());
        }
    }

    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.add("qrtqt");
        coffeeOrderBoard.add("hgffj");
        coffeeOrderBoard.add("bcvfdg");
        coffeeOrderBoard.add("asdags");
        coffeeOrderBoard.draw();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.draw();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.draw();
    }
}
