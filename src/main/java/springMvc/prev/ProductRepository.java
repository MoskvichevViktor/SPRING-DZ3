package springMvc.prev;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class ProductRepository {
    private List<Product> products;

    public ProductRepository(){
        this.products = new ArrayList<>();
        this.products.add(new Product(1, "Product_1", 10));
        this.products.add(new Product(2, "Product_2", 20));
        this.products.add(new Product(3, "Product_3", 30));
        this.products.add(new Product(4, "Product_4", 40));
        this.products.add(new Product(5, "Product_5", 50));
    }

    public Optional<Product> findById(int id){

        return products.stream().filter(p -> p.getId() == id).findFirst();
    }
    public List<Product> findAll(){
        return products;
    }

    public void add(Product product){
        this.products.add(product);
    }


    @Override
    public String toString() {
        return "ProductRepository{" +
                "products=" + products +
                '}';
    }
}
