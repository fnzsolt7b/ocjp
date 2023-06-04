package hu.fnzsoft.jmm;

import hu.fnzsoft.jmm.pojos.*;
import hu.fnzsoft.jmm.records.Address;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DemoEscapingProducts {

    public static Order createOrder(User user, List<String> products) {
        return new Order(LocalDate.now(), products, user);
    }

    private static OrderWithProduct createOrderWithProduct(User user, List<Product> products) {
        return new OrderWithProduct(LocalDate.now(), products, user);
    }

    public static void processProducts(List<String> products) {
        for (String product : products) {
            System.out.println(product);
        }
    }

    public static void processRealProducts(List<Product> products) {
        for (Product product: products) {
            System.out.println(product.getName());
        }
    }

    public static void main(String[] args) {

        User user = new User("puppet",
                new Address("stname", "12", "1Z", "c", "C"),
                new SensitiveObject());

        List<String> products = new ArrayList<>();
        products.add("product 1");

        doSomeStuff(createOrder(user, products));

        List<Product> otherProducts = new ArrayList<>();
        otherProducts.add(new Product("product 1","product description ...", 3.5));

        doSomeStuffWithProduct(createOrderWithProduct(user, otherProducts));

    }

    private static void doSomeStuff(Order o) {

        //process products original list
        System.out.println("--original--");
        processProducts(o.getProducts());

        //process products copy list
        List<String> copy = o.getProducts(); //here we made a shallow clone. The object on the collection are not cloned
        System.out.println("\n--copy--");
        processProducts(copy);

        //modify new list
        System.out.println("\n--modifying--\n");
        copy.add("product 2");

        //process products original list
        System.out.println("--original--");
        processProducts(o.getProducts());

        //process products copy list
        System.out.println("\n--copy--");
        processProducts(copy);
    }

    private static void doSomeStuffWithProduct(OrderWithProduct o) {

        //process products original list
        System.out.println("--original--");
        processRealProducts(o.getProducts());

        //process products copy list
        List<Product> copy = o.getProducts();
        System.out.println("\n--copy--");
        processRealProducts(copy);

        //modify new list
        System.out.println("\n--modifying--\n");
        copy.get(0).setName("product modified");
        copy.add(new Product("product 2","product description", 37.5));

        //process products original list
        System.out.println("--original--");
        processRealProducts(o.getProducts());

        //process products copy list
        System.out.println("\n--copy--");
        processRealProducts(copy);
    }
}
