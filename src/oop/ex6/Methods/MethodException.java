package oop.ex6.Methods;

public class MethodException extends Throwable {

    private String name ;

    MethodException(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "method " + name + " is invalid";
    }
}
