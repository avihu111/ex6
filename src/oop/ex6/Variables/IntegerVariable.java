package oop.ex6.Variables;

public class IntegerVariable  extends Variable{
    public IntegerVariable(String name, String value) throws VariableException {
        super(name, value);
    }

    @Override
    public boolean verifyValue(String value) {
        return false;
    }
}
