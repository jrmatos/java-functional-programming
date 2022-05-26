package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Object value = Optional.ofNullable("Hello")
                .orElseGet(() -> "Default value");

        System.out.println(value);

//        Optional.ofNullable(null)
//                .orElseThrow(() -> new IllegalStateException("could not perform action"));

        Optional.ofNullable("jhon@gmail.com")
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to " + email),
                        () -> System.out.println("Cannot send email")
                );
    }
}
