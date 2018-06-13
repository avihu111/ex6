package oop.ex6.Methods;

import oop.ex6.Scopes.Scope;
import oop.ex6.Scopes.UnclosedScopeException;
import oop.ex6.Variables.VariableException;
import oop.ex6.main.LineReader;

import java.util.ArrayList;

public class VoidMethod extends Method {

    public VoidMethod(Scope parent, String name, String returnValue, ArrayList<String> parmeters)
            throws UnclosedScopeException, VariableException {
        super(parent, name, returnValue, parmeters);
    }

    @Override
    void validateTypeMethod() {

        // TODO: check method is void
    }

}
