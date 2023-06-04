package hu.fnzsoft.jmm;

import hu.fnzsoft.jmm.records.Address;
import hu.fnzsoft.jmm.records.Person;

public class ExampleString {

    public static void main(String[] args) {
        String name = "puppy";
        String dog = "vizsla";
        String cat = "sziami";
        String rabbit = "puppy";
        String anotherRabbit = new String("puppy");

        Person p = new Person(name, 1991, true,
                new Address("a","1", "z", "c", "c"));
    }
}
