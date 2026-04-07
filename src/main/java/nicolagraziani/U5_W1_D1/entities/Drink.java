package nicolagraziani.U5_W1_D1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Drink extends Menu {
    private String name;

    public Drink(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Drink = " +
                " name= " + name +
                ", calories= " + super.getCalories() +
                ", price= " + super.getPrice();

    }
}
