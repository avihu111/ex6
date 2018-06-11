package oop.ex6.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class LineReader {


    private Scanner scanner;

    private Pattern ifPattern;
    private Pattern whilePattern;
    private Pattern commentPattern;
    private Pattern declerationPattern;
    private Pattern assignmentPattern;
    private Pattern methodPattern;

    // TODO: singleton??
    LineReader(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        scanner = new Scanner(file);

        // TODO: regular expressions
        ifPattern = Pattern.compile("if");
        commentPattern = Pattern.compile("//");
        whilePattern = Pattern.compile("while");
        declerationPattern = Pattern.compile("int|String|boolean|double");
        assignmentPattern = Pattern.compile("=");
        methodPattern = Pattern.compile("void");
    }


    boolean readLine(Scope scope) throws UnclosedScopeException {
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
}
