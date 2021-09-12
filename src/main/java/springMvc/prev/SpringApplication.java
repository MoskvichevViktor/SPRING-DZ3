package springMvc.prev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CartConfiguration.class);
        Cart cart = context.getBean(Cart.class);
        ProductRepository repository = context.getBean(ProductRepository.class);

    }
}
