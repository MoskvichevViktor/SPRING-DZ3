package springMvc.current;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springMvc.prev.CartConfiguration;

@Configuration
@Import(CartConfiguration.class)
public class RootWebApplication  {

}


