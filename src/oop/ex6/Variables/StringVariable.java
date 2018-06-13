package oop.ex6.Variables;

public class StringVariable extends Variable{

    StringVariable(String name, String value) throws VariableException {
        super(name, value);

    }


    @Override
    public boolean verifyValue(String value) {
        return false;
    }
}
