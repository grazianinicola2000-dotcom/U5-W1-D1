package nicolagraziani.U5_W1_D1.config;

import nicolagraziani.U5_W1_D1.entities.Drink;
import nicolagraziani.U5_W1_D1.entities.MenuPrint;
import nicolagraziani.U5_W1_D1.entities.Pizza;
import nicolagraziani.U5_W1_D1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigClass {

    @Bean(name = "tomato")
    public Topping tomato() {
        return new Topping("Tomato", 0, 0);
    }

    @Bean(name = "cheese")
    public Topping cheese() {
        return new Topping("Cheese", 92, 0.69);
    }

    @Bean(name = "ham")
    public Topping ham() {
        return new Topping("Ham", 35, 0.99);
    }

    @Bean(name = "onions")
    public Topping onions() {
        return new Topping("Onions", 22, 0.69);
    }

    @Bean(name = "pineapple")
    public Topping pineapple() {
        return new Topping("Pineapple", 24, 0.79);
    }

    @Bean(name = "salami")
    public Topping salami() {
        return new Topping("Salami", 86, 0.99);
    }

    @Bean(name = "pizza_margherita")
    public Pizza pizzaMargherita() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(tomato());
        toppings.add(cheese());
        return new Pizza("Pizza Margherita", toppings);
    }

    @Bean(name = "hawaiian_pizza")
    public Pizza pizzaHawaiian() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(tomato());
        toppings.add(cheese());
        toppings.add(ham());
        toppings.add(pineapple());
        return new Pizza("Hawaiian Pizza", toppings);
    }

    @Bean(name = "salami_pizza")
    public Pizza pizzaSalami() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(tomato());
        toppings.add(cheese());
        toppings.add(salami());
        return new Pizza("Salami Pizza", toppings);
    }

    @Bean(name = "lemonade")
    public Drink lemonade() {
        return new Drink("Lemonade (0.33l)", 128, 1.29);
    }

    @Bean(name = "water")
    public Drink water() {
        return new Drink("Water (0.5l)", 0, 1.29);
    }

    @Bean(name = "wine")
    public Drink wine() {
        return new Drink("Wine (0.75l, 13%)", 607, 7.49);
    }

    @Bean(name = "menu")
    public MenuPrint printMenu(List<Pizza> pizzas, List<Topping> toppings, List<Drink> drinks) {
//        List<Pizza> pizzas = new ArrayList<>();
//        List<Topping> toppings = new ArrayList<>();
//        List<Drink> drinks = new ArrayList<>();
//
//        pizzas.add(pizzaMargherita());
//        pizzas.add(pizzaHawaiian());
//        pizzas.add(pizzaSalami());
//
//        toppings.add(cheese());
//        toppings.add(ham());
//        toppings.add(onions());
//        toppings.add(pineapple());
//        toppings.add(salami());
//
//        drinks.add(lemonade());
//        drinks.add(water());
//        drinks.add(wine());

        return new MenuPrint(pizzas, toppings, drinks);
    }
}
