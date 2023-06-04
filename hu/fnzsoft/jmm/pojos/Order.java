package hu.fnzsoft.jmm.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private User user;

    private List<String> products;

    private LocalDate orderDate;

    public Order(LocalDate orderDate, List<String> products, User user) {
        this.orderDate = orderDate;
        this.products = new ArrayList<>(products);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public List<String> getProducts() {
        return new ArrayList<>(products);
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}
