package nicolagraziani.U5_W1_D1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Table {
    private Order order;
    private int number;
    private int seats;
    private boolean reserved;

    public Table(int number, int seats, boolean reserved) {
        this.number = number;
        this.seats = seats;
        this.reserved = reserved;
    }

    @Override
    public String toString() {
        return "Table{" +
                "number=" + number +
                ", seats=" + seats +
                ", reserved=" + reserved +
                '}';
    }
}
