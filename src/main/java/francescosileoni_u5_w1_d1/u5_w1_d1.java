package francescosileoni_u5_w1_d1;

import francescosileoni_u5_w1_d1.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class u5_w1_d1 {

    public static void main(String[] args) {
        SpringApplication.run(u5_w1_d1.class, args);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(u5_w1_d1.class);
        Menu menu = ctx.getBean(Menu.class);
        System.out.println(menu);


    }

}
