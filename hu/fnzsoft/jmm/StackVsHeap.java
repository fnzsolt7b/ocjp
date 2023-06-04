package hu.fnzsoft.jmm;

import hu.fnzsoft.jmm.records.Address;
import hu.fnzsoft.jmm.records.Person;

/**
 *  Stack memory:
 *  - Only references and primitive values
 *  - Accesses LIFO
 *  - Smaller and automatically deallocated
 *  - Faster to access
 *  - Exists if the method is running
 *  - Memory full: StackOverflowError
 *
 *  Heap memory:
 *  - Objects (which contain references and primitive values)
 *  - Accessible whenever you have the address
 *  - Bigger and deallocated by garbage collector
 *  - Slower to access
 *  - Exists for application lifetime
 *  - Memory full: OutOfMemoryError
 *
 * 1. Accessing primitives on the stack is faster than accessing objects.
 * 2. Java primitives cannot be used for collections.
 *
 * In a heap we have a special memory segment called String pool
 *
 */
public class StackVsHeap {

    public static void main(String[] args) {
        //stack memory
        int x = 5;
        double y = 3;
        final int xy = 3;

        //stack and heap memory
        Address a = new Address("Example street", "22", "11345Z","Warshow", "Poland");
        Person p = new Person("Kelly", 1967, true, a);
        Person anotherp = new Person("Kelly", 1967, true, a);

        //always look at object references (or the address of the heap)
        System.out.println(p == anotherp);
        //look at the object contents if implemented!
        System.out.println(p.equals(anotherp));

    }

}
