package oop.ex6.main;

import java.io.FileNotFoundException;

public class Sjavac {



    public static void main(String[] args){

        if (args.length != 1){
            // raise something

        }
        else{
            try {
                Parser.parse(args[0]);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }


    }
}
