package oop.ex6.Variables;

public class VariableException extends Exception{

    private String name;

    VariableException(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "problem with variable: " + name;
    }
}
