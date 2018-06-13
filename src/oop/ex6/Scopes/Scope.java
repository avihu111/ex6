package oop.ex6.Scopes;

import oop.ex6.Methods.MethodException;
import oop.ex6.Variables.Variable;
import oop.ex6.Variables.VariableException;
import oop.ex6.main.LineReader;

import javax.sound.sampled.Line;
import java.util.HashMap;

public class Scope {

    public Scope parent;
    private LineReader lineReader;
    private HashMap<String, Variable> variables;

    public Scope(Scope parent) throws UnclosedScopeException, VariableException {
        this.parent = parent;
        this.lineReader = parent.lineReader;
        this.variables = new HashMap<>();
        boolean isScopeOpen = true;
        while (isScopeOpen) {
            isScopeOpen = lineReader.readLine(this);
        }
    }

    public Scope(LineReader lineReader) throws UnclosedScopeException, VariableException {
        this.lineReader = lineReader;
        this.variables = new HashMap<>();
        boolean isScopeOpen = true;
        while (isScopeOpen) {
            isScopeOpen = lineReader.readLine(this);
        }
    }



    public boolean isVariableInScope(Variable variable) {
        Scope current = this;
        while (current != null) {
            if (variables.containsValue(variable)) {
                return true;
            }
            current = current.parent;
        }
        return false;
    }
}
