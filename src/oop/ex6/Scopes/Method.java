package oop.ex6.Scopes;


import oop.ex6.Variables.Variable;
import oop.ex6.main.LineReader;

// extents scope
public class Method extends Scope {

    private String name ;
    private Variable returnValue;

    public Method(Scope parent, LineReader lineReader, String name, Variable returnValue)
            throws UnclosedScopeException {
        super(parent, lineReader);
        this.name = name;
        this.returnValue = returnValue;

    }

    public String getName() {
        return name;
    }

    public Variable getReturnValue() {
        return returnValue;
    }
}
