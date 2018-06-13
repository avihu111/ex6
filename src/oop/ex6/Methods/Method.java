package oop.ex6.Methods;


import oop.ex6.Scopes.Scope;
import oop.ex6.Scopes.UnclosedScopeException;
import oop.ex6.Variables.VariableException;
import oop.ex6.main.LineReader;

import java.util.ArrayList;

// extents scope
public abstract class Method {
    private final String name;
    private final String returnValue;
    private final ArrayList<String> parmeters;
    private final Scope scope;


    Method(Scope parent, String name, String returnValue, ArrayList<String> parameters)
            throws UnclosedScopeException, VariableException {

        validateMethod();
        this.name = name;
        this.returnValue = returnValue;
        this.parmeters = parameters;
        scope = new Scope(parent);
    }

    abstract void validateTypeMethod();

    private void validateMethod(){
        // parameters go here

        validateTypeMethod();
    }

    public String getName() {
        return name;
    }

    public String getReturnValue() {
        return returnValue;
    }

    public Scope getScope() {
        return scope;
    }


}
