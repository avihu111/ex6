package oop.ex6.main;

import oop.ex6.Scopes.Scope;
import oop.ex6.Scopes.UnclosedScopeException;
import oop.ex6.Variables.VariableException;

import java.io.FileNotFoundException;


public class Sjavac {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println(2);
        } else {
            try {
                LineReader lineReader = new LineReader(args[0]);
                Scope scope = new Scope(lineReader);
            } catch (FileNotFoundException e) {
                System.out.println(2);
            } catch (UnclosedScopeException | VariableException e) {
                System.out.println(1);
            }

        }
    }
}
