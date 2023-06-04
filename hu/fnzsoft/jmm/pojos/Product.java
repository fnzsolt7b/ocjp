package hu.fnzsoft.jmm.pojos;

public class Product implements Cloneable {

    private String name;

    private String description;

    private double price;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Product productClone = null;
        productClone = (Product) super.clone();

        // overwrite all mutable properties, in this case there are none
        return productClone;
    }
}
