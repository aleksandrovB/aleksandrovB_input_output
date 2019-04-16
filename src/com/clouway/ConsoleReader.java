package com.clouway;

import java.util.Scanner;

public class ConsoleReader {
    Scanner scan = new Scanner(System.in);
    public ConsoleReader() {
    }

    public String readString(){
        return scan.nextLine();
    }

    public int readInt() {
        return Integer.parseInt(scan.nextLine());
    }

    public char readChar(){
        return scan.nextLine().charAt(0);
    }

    public float readFloat(){
        return Float.parseFloat(scan.nextLine());
    }
}
