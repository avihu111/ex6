package oop.ex6.main;
import oop.ex6.Scopes.Scope;

import java.io.FileNotFoundException;


public class Sjavac {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println(2);
        }
        else {
            try {
                LineReader lineReader = new LineReader(args[0]);
                Scope scope = new Scope(null, lineReader);
            } catch (FileNotFoundException e) {
                System.out.println(2);
            } catch (UnclosedScopeException e) {
                System.out.println(1);
            }

        }
    }
}
