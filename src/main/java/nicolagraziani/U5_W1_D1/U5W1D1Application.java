package nicolagraziani.U5_W1_D1;

import nicolagraziani.U5_W1_D1.entities.MenuPrint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5W1D1Application {

    public static void main(String[] args) {
        SpringApplication.run(U5W1D1Application.class, args);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D1Application.class);

        MenuPrint menu = (MenuPrint) ctx.getBean("menu");

        menu.printMenu();
        ctx.close();
    }

}
