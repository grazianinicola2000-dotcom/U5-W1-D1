package nicolagraziani.U5_W1_D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import nicolagraziani.U5_W1_D1.enums.OrderState;

import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@ToString
public class Order {
    List<Menu> items;
    private int orderNumber;
    private OrderState state;
    private int seats;
    private LocalTime time;
    private double seatsPrice;

    public Order(List<Menu> items, int orderNumber, OrderState state, int seats, LocalTime time, double seatsPrice) {
        this.items = items;
        this.orderNumber = orderNumber;
        this.state = state;
        this.seats = seats;
        this.time = time;
    }

    public double getTotal() {
        double itemsTotal = items.stream().mapToDouble(Menu::getPrice).sum();
        return itemsTotal + (seats * seatsPrice);
    }
}
