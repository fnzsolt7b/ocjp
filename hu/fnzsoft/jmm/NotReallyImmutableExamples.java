package hu.fnzsoft.jmm;

import java.util.List;

public class NotReallyImmutableExamples {

    private final int numberOfPredication ;
    private final List<String> names;

    public NotReallyImmutableExamples(Integer x, List<String> names) {
        this.numberOfPredication = x;
        this.names = names;
    }

}
