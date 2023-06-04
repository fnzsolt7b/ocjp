package hu.fnzsoft.jmm;

public class Methods {

    public void method1() {
        int x = 0;
        method2(x);
    }

    /**
     * pass by value
     * it means value x modification is only live inside this method
     * @param x
     */
    public void method2(int x) {
        x = 2;
        int y = 1;
        method3();
    }

    public void method3() {
        int z = 2;
    }

}
