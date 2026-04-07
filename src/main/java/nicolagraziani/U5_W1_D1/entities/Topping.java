package nicolagraziani.U5_W1_D1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Topping extends Menu {
    private String name;

    public Topping(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Topping = " +
                " name= " + name +
                ", calories= " + super.getCalories() +
                ", price= " + super.getPrice();
    }
}
