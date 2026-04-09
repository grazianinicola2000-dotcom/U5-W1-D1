package nicolagraziani.U5_W1_D1.runners;

import nicolagraziani.U5_W1_D1.entities.Menu;
import nicolagraziani.U5_W1_D1.entities.MenuPrint;
import nicolagraziani.U5_W1_D1.entities.Order;
import nicolagraziani.U5_W1_D1.entities.Table;
import nicolagraziani.U5_W1_D1.enums.OrderState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.List;

@Component
public class MuneRunner implements CommandLineRunner {
    @Autowired
    private MenuPrint menu;
    @Autowired
    @Qualifier("table2")
    private Table table;
    @Autowired
    @Qualifier("pizza_margherita")
    private Menu pizzaMargherita;
    @Autowired
    @Qualifier("salami_pizza")
    private Menu pizzaSalami;
    @Autowired
    @Qualifier("hawaiian_pizza")
    private Menu pizzaHawaiian;
    @Autowired
    @Qualifier("lemonade")
    private Menu lemonade;
    @Autowired
    @Qualifier("wine")
    private Menu wine;
    @Autowired
    @Qualifier("water")
    private Menu water;
    @Value("${seats.price}")
    private double seatPrice;

    @Override
    public void run(String... args) throws Exception {
        menu.printMenu();
        Order order1 = new Order(List.of(pizzaMargherita, pizzaSalami, pizzaMargherita, pizzaHawaiian, lemonade, wine, water), 1, OrderState.SERVITO, 4, LocalTime.now(), seatPrice);
        table.setOrder(order1);
        System.out.println();
        System.out.println("ORDER TABLE 1");
        System.out.println(table.toString());
        System.out.println(table.getOrder());
        System.out.println("Totale tavolo 1: " + table.getOrder().getTotal());
    }


}
