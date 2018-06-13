package oop.ex6.Variables;

public abstract class Variable {

    private final String name;
    private String value;


    Variable(String name, String value) throws VariableException {
        this.name = name;
        this.value = value;
        if (!verifyValue(value)) {
            throw new VariableException(name);
        }
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public abstract boolean verifyValue(String value);

}
