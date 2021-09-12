package springMvc.prev;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OrderRepository {

    private List<Order> orders;

    public OrderRepository(){
        this.orders = new ArrayList<>(
                List.of(new Order(1, LocalDate.now(), 800.00F, Collections.emptyList()))

        );
    }

    public Optional<Order> findById(int id){

        return orders.stream().filter(o -> o.getId() == id).findFirst();
    }
    public List<Order> findAll(){
        return orders;
    }

    public void add(Order orders){
        this.orders.add(orders);
    }


    @Override
    public String toString() {
        return "OrderRepository{" +
                "orders=" + orders +
                '}';
    }
}
