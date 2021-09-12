package springMvc.current.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springMvc.prev.Product;
import springMvc.prev.ProductRepository;

@Controller
public class ProductController {

    private final ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }


    @RequestMapping(value = "/products",method = RequestMethod.GET)
    public String findAll(Model model){
        model.addAttribute("products", repository.findAll());
        return "products";

    }

    @RequestMapping(value = "/products/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable String id){

    }

    @RequestMapping(value = "/products",method = RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("product", new Product());
        return "products-add";

    }

    //добавить
    @RequestMapping(value = "/products/add",method = RequestMethod.POST)
    public String add(Product product){
        repository.add(product);
        return  "products";

    }

}
