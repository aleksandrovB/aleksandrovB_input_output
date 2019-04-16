package com.clouway;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Path textFileDir = Paths.get("/home/clouway/clouway/workspaces/idea/TextFilesDir/");
        FileLinesDataSource flds = new FileLinesDataSource(textFileDir.resolve("copyFileContext.txt"));
        new FileReverser().reverse(textFileDir.resolve("copyFileContext.txt"),flds);
    }
}
