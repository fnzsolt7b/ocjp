package hu.fnzsoft.lambda;

public class LambdaThis {

    public interface SimpleInterface {
        String retrieveValue();
    }

    String value = "default value";

    public SimpleInterface createLambdaInterface() {
        return () -> {
            String value = "lambda value";
            return this.value;
        };
    }

    public SimpleInterface createAnonymousInterface() {
        return new SimpleInterface() {
            final String value1 = "anonymous value";
            @Override
            public String retrieveValue() {
                return this.value1;
            }
        };
    }

    public static void main(String[] args) {
        LambdaThis lt = new LambdaThis();

        SimpleInterface lambdaInterface = lt.createLambdaInterface();
        SimpleInterface anonymousInterface = lt.createAnonymousInterface();

        System.out.println("Lambda interface value : " + lambdaInterface.retrieveValue());
        System.out.println("Anonymous interface value : " + anonymousInterface.retrieveValue());

    }
}
