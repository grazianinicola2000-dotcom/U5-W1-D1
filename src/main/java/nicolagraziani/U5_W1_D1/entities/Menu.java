package nicolagraziani.U5_W1_D1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Menu {
    private int calories;
    private double price;

    public Menu(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }
}
