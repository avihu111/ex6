package oop.ex6.Variables;

public class VariableFactory {


    public static Variable create(String type, String name, String value) throws VariableException {
        switch (type) {
            case "boolean":
                return new BooleanVariable(name, value);
            case "double":
                return new DoubleVariable(name, value);
            case "int":
                return new IntegerVariable(name, value);
            case "String":
                return new StringVariable(name, value);
            case "char":
                return new CharVariable(name, value);
            default:
                throw new VariableException(name);
        }
    }


}
