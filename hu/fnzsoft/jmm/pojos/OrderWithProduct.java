package hu.fnzsoft.jmm.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderWithProduct {

    private User user;

    private List<Product> products;

    private LocalDate orderDate;

    public OrderWithProduct(LocalDate orderDate, List<Product> products, User user) {
        this.orderDate = orderDate;
        this.products = new ArrayList<>(products);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public List<Product> getProducts() {

        //return new ArrayList<>(products);

        //We can solve if we return with an unmodifiable list here
        //return List.copyOf(products);
        //or in this way
        //return Collections.unmodifiableList(products);

        //deep copy
        List<Product> copy = new ArrayList<>();
        for (Product p : products) {
            try {
                copy.add((Product)p.clone());
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
        return copy;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}
