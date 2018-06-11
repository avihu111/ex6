package oop.ex6.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parser {

    static void parse(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            try {
                

                System.out.println(scanner.nextLine());
            }
            catch (Exception e){

            }
        }


    }
}
