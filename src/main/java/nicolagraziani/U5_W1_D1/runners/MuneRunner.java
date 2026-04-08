package nicolagraziani.U5_W1_D1.runners;

import nicolagraziani.U5_W1_D1.entities.MenuPrint;
import nicolagraziani.U5_W1_D1.entities.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MuneRunner implements CommandLineRunner {
    @Autowired
    private MenuPrint menu;
    @Autowired
    @Qualifier("table2")
    private Table table;

    @Override
    public void run(String... args) throws Exception {
        menu.printMenu();
        System.out.println();
        System.out.println("ORDER TABLE 1");
        System.out.println(table.toString());
    }


}
