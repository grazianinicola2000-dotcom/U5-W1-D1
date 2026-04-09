package nicolagraziani.U5_W1_D1;

import nicolagraziani.U5_W1_D1.entities.Menu;
import nicolagraziani.U5_W1_D1.entities.Order;
import nicolagraziani.U5_W1_D1.entities.Pizza;
import nicolagraziani.U5_W1_D1.entities.Topping;
import nicolagraziani.U5_W1_D1.enums.OrderState;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class U5W1D1ApplicationTests {

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
    @Qualifier("cheese")
    private Topping cheese;
    @Autowired
    @Qualifier("ham")
    private Topping ham;
    @Autowired
    @Qualifier("tomato")
    private Topping tomato;
    @Value("${seats.price}")
    private double seatPrice;


    @Test
    public void testOrderCreationAndTotalPrice() {
        Order order = new Order(List.of(pizzaHawaiian, pizzaSalami, lemonade), 1, OrderState.SERVITO, 5, LocalTime.now(), seatPrice);
        assertNotNull(order);
        assertEquals(29.04, order.getTotal());
    }

    @Test
    public void testSetPizzaPrice() {
        Pizza pizza = new Pizza("Prosciutto", List.of(ham, tomato, cheese));
        double pizzaPrice = pizza.getPrice();
        assertEquals(5.98, pizzaPrice);
    }

    @Test
    public void testSetPizzaCalories() {
        Pizza pizza = new Pizza("Prosciutto", List.of(ham, tomato, cheese));
        int pizzaCalories = pizza.getCalories();
        assertEquals(1139, pizzaCalories);
    }

}
