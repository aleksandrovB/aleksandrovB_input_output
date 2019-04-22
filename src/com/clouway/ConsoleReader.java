package com.clouway;

import java.util.Scanner;

public class ConsoleReader {
    private Scanner scan = new Scanner(System.in);
    public ConsoleReader() {
    }

    /**
     * Reads next line from console
     * @return next console line
     */
    public String readString(){
        return scan.nextLine();
    }

    /**
     * Reads line from console and parses it to Integer
     * @return next line as integer if next line is number
     */
    public int readInt() {
        return Integer.parseInt(scan.nextLine());
    }

    /**
     * Reads fir
     * @return
     */
    public char readChar() throws Exception {
        String temp = scan.nextLine();
        if (temp.length() == 1)
            return scan.nextLine().charAt(0);
        else {
            throw new Exception("This line is not a char");
        }
    }

    /**
     * Reads line from console and parses it to float
     * @return next line as Float if next line is parsable float
     */
    public float readFloat(){
        return Float.parseFloat(scan.nextLine());
    }
}
