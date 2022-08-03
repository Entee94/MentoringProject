import sun.awt.CharsetString;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    int variableForReference = 8;
    int value = 1;

    int[] myNumbers = {1, 2, 3, 4, 5};

    public static void main(String[] args) {

        //Main main = new Main();
        //main.ifElseExample();
        //main.switchExample();
        //main.forExample();
        //main.forEachExample();
        //main.whileExample();
        //main.doWhileExample();
        ExeptionsExamples examples = new ExeptionsExamples();
//        examples.checkedException();
       // examples.indexOutOfBounds();
       // examples.multiCheck();
//        examples.simpleTry();
//        examples.tryWithResources();

    }

    public void ifElseExample() {
        if (variableForReference > value) {
            doSomething();
        } else if (variableForReference < value) {
            doSomethingElse();
        } else {
            doNothing();
        }
    }

    public void switchExample() {
        switch (variableForReference) {
            case 1:
                doSomething();
                break;
            case 2:
                doSomethingElse();
                break;

            default:
                doNothing();

        }
    }

    public void forExample() {
        for (int i = 0; i < 5; i++) {
            int number = i + 1;
            System.out.println("I am counting to 5. Now I have " + number);
        }
    }

    public void forEachExample() {
        for (int number : myNumbers) {
            System.out.println(number + 10);
        }

    }

    public void whileExample() {
        while (variableForReference > value) {
            System.out.println(variableForReference + " is still more than " + value);
            variableForReference--;
        }
        System.out.println(variableForReference);
    }

    public void doWhileExample() {
        do {
            System.out.println(variableForReference + " is still more than " + value);
            variableForReference--;
        } while (variableForReference > value);
        System.out.println(variableForReference);
    }

    public void doSomething() {
        System.out.println("I did something");
    }

    public void doSomethingElse() {
        System.out.println("I did something else");
    }

    public void doNothing() {
        System.out.println("I did nothing");
    }

}
