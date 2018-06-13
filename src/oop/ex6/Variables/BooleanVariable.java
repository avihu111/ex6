package oop.ex6.Variables;

public class BooleanVariable extends Variable {

    BooleanVariable(String name, String value) throws VariableException {
        super(name, value);
    }

    @Override
    public boolean verifyValue(String value) {
        // TODO: implement the check
        return false;
    }
}
