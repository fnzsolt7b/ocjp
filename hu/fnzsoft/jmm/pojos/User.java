package hu.fnzsoft.jmm.pojos;

import hu.fnzsoft.jmm.records.Address;

public class User {

    private String name;

    private Address address;

    private SensitiveObject sensitive;

    public User(String name, Address address, SensitiveObject sensitive) {
        this.name = name;
        this.address = address;
        this.sensitive = sensitive;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public SensitiveObject getSensitive() {
        return sensitive;
    }
}
