package hu.fnzsoft.jmm;

public class ExampleStackOverflow {
    
    public ExampleStackOverflow() {
        ExampleStackOverflow exampleStackOverflow = new ExampleStackOverflow();
    }

    public static void main(String[] args) {
        //new ExampleStackOverflow();
        getStackOverflow();
    }

    public static void getStackOverflow() {
        getStackOverflow();
    }
}
