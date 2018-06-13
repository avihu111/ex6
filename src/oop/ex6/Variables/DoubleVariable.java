package oop.ex6.Variables;

public class DoubleVariable extends Variable {
     DoubleVariable(String name, String value) throws VariableException {
        super(name, value);
    }

    @Override
    public boolean verifyValue(String value) {
        return false;
    }
}
