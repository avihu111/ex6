package oop.ex6.Variables;

public class CharVariable extends Variable {
    CharVariable(String name, String value) throws VariableException {
        super(name, value);


    }

    @Override
    public boolean verifyValue(String value) {
        return false;
    }
}
