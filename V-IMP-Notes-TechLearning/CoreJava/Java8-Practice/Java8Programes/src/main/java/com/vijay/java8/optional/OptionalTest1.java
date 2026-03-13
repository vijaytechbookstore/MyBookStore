package com.vijay.java8.optional;

import java.util.Optional;

public class OptionalTest1 {

    public static void main(String[] args) {
        isPresentOptionalAPI();
        createEmptyOptionalObject();
        createEmptyOptionalObjectWithStaticAPI();
        ifPresentOptionalAPI();
        orElseOptionalAPI();
        orElseGetOptionalAPI();
        //orElseThrowOptionalAPI();
        getOptionalAPI();
    }

    // Returns an Optional with the specified present non-null value.
    private static void isPresentOptionalAPI() {
        Optional < String > opt = Optional.of("Ramesh");
        System.out.println(opt.isPresent()); //true
    }

    // Returns an Optional with the specified present non-null value.
    private static void createEmptyOptionalObject() {
        Optional < String > empty = Optional.empty();
        System.out.println(empty.isPresent());//false

    }

    private static void createEmptyOptionalObjectWithStaticAPI() {
        // Optional object with the static of API:
        String name = "baeldung";
        Optional.of(name);
    }

    // If a value is present, invoke the specified consumer with the value, otherwise do
// nothing.
    private static void ifPresentOptionalAPI() {
        // The ifPresent API enables us to run some code on the wrapped value if it is
        // found to be non-null.
        // Before Optional, we would do something like this:
        String name = "Ramesh";
        if (name != null) {
            System.out.println(name.length()); //6
        }

        Optional < String > opt = Optional.of("Ramesh");
        opt.ifPresent(str -> System.out.println(str.length())); //6
    }

    // If a value is present, invoke the specified consumer with the value, otherwise do
    // nothing.
    private static void orElseOptionalAPI() {
        // With orElse, the wrapped value is returned if it is present and the argument
        // given to
        // orElse is returned if the wrapped value is absent
        String nullName = null;

        // If a value is present, invoke the specified consumer with the value, otherwise
        // do nothing.
        //
        String name = Optional.ofNullable(nullName).orElse("Ramesh");
        System.out.println(name); //Ramesh
    }

    private static void orElseGetOptionalAPI() {
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElseGet(() -> "Ramesh");
        System.out.println(name); //Ramesh
    }
 /*   private static void orElseThrowOptionalAPI() {

        // This will throw exception
        String nullName = null;
        String name = Optional.ofNullable(nullName)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(name);
    }*/

    private static void getOptionalAPI() {
        Optional < String > opt = Optional.of("Ramesh");
        String name = opt.get();
        System.out.println(name); //Ramesh
    }


}







