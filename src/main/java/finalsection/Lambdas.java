package finalsection;

import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        Function<String, String> upperCaseName = String::toUpperCase;
    }
}
