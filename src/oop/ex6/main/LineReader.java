package oop.ex6.main;

import oop.ex6.Scopes.Scope;
import oop.ex6.Scopes.UnclosedScopeException;
import oop.ex6.Variables.Variable;
import oop.ex6.Variables.VariableException;
import oop.ex6.Variables.VariableFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class LineReader {

    private Scanner scanner;
    // patterns
    private Pattern ifPattern;
    private Pattern whilePattern;
    private Pattern commentPattern;
    private Pattern declerationPattern;
    private Pattern assignmentPattern;
    private Pattern methodPattern;
    private Pattern finalPattern;


    // TODO: singleton??
    LineReader(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        scanner = new Scanner(file);


        ifPattern = Pattern.compile("if\\(");
        commentPattern = Pattern.compile("//.*");
        whilePattern = Pattern.compile("while");
        declerationPattern = Pattern.compile("(int|double|char|boolean|String) +(\\w+) *= *(\\S+);");
        assignmentPattern = Pattern.compile("=");
        methodPattern = Pattern.compile("void");
        finalPattern = Pattern.compile("final +(int|double|char|boolean|String) +(\\w+) *= *(\\S+);");
    }


    public boolean readLine(Scope scope) throws UnclosedScopeException, VariableException {
        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            line = line.trim();



            if (ifPattern.matcher(line).matches()) {
                // TODO: verify if and open new scope
                // also check if father is null

            }

            if (methodPattern.matcher(line).matches()) {
                // TODO: verify if and open new scope
            }


            if (line.equals("}")) {
                return false;
            }


            // int\String...
            if (match(declerationPattern, line)){
                Matcher matcher = declerationPattern.matcher(line);
                Variable variable = VariableFactory.create(matcher.group(1), matcher.group(2), matcher.group(3));

            }

            // while


            // var name

            // method name

            // empty line

            // comment

            // closing block

            // else exception


            return true;
        } else if (scope.parent != null) {
            // throw something
            throw new UnclosedScopeException();
        }
        return true;

    }


    private static boolean match(Pattern pattern, String line){
        Matcher matcher = pattern.matcher(line);
        return matcher.matches();
    }

}
