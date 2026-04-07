package nicolagraziani.U5_W1_D1.entities;

import lombok.Getter;

import java.util.List;

@Getter
public class Pizza extends Menu {
    private String name;
    private List<Topping> toppings;


    public Pizza(String name, List<Topping> toppings) {
        super(setPizzaCalories(toppings), setPizzaPrice(toppings));
        this.name = name;
        this.toppings = toppings;
    }

    public static int setPizzaCalories(List<Topping> toppings) {
        int calories = 1012;
        if (toppings != null) {
            for (int i = 0; i < toppings.size(); i++) {
                calories += toppings.get(i).getCalories();
            }
        }
        return calories;
    }

    public static double setPizzaPrice(List<Topping> toppings) {
        double price = 4.3;
        if (toppings != null) {
            for (int i = 0; i < toppings.size(); i++) {
                price += toppings.get(i).getPrice();
            }
        }
        return price;
    }

    @Override
    public String toString() {
        return "Pizza = " +
                " name= " + name +
                ", toppings= " + toppings +
                ", calories= " + super.getCalories() +
                ", price= " + super.getPrice();
    }
}
