package com.clouway;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        Path textFileDir = Paths.get("/home/clouway/clouway/workspaces/idea/TextFilesDir/");
        FileLinesDataSource flds = new FileLinesDataSource(textFileDir.resolve("copyFileContext.txt"));
        new FileReverser().reverse(textFileDir.resolve("copyFileContext.txt"),flds);

        try {
            System.out.println(new ConsoleReader().readFloat());
        } catch (NumberFormatException e){
            e.printStackTrace();
        }

        try {
            System.out.println(new ConsoleReader().readInt());
        } catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
}
