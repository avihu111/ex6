package oop.ex6.Scopes;

import oop.ex6.Variables.Variable;
import oop.ex6.main.LineReader;

import java.util.ArrayList;

public class Scope {

    public Scope parent;
    private LineReader lineReader;
    private ArrayList<Variable> variables;


    public Scope(Scope parent, LineReader lineReader) throws UnclosedScopeException {
        this.parent = parent;
        this.lineReader = lineReader;
        this.variables = new ArrayList<>();

        boolean isScopeOpen = true;
        while (isScopeOpen) {
            isScopeOpen = lineReader.readLine(this);
        }
    }


    public boolean isVariableInScope(Variable variable) {
        Scope current = this;
        while (current != null) {
            if (variables.contains(variable)) {
                return true;
            }
            current = current.parent;
        }
        return false;
    }
}
