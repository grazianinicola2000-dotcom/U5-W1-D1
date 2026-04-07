package nicolagraziani.U5_W1_D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MenuPrint {
    private List<Pizza> pizzas;
    private List<Topping> toppings;
    private List<Drink> drinks;

    public void printMenu() {
        System.out.println("-----------------PIZZAS-----------------");
        this.pizzas.forEach(System.out::println);
        System.out.println("-----------------TOPPINGS-----------------");
        this.toppings.forEach(System.out::println);
        System.out.println("-----------------DRINKS-----------------");
        this.drinks.forEach(System.out::println);
    }
}
