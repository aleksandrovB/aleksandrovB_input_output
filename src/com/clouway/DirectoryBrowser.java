package com.clouway;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

public class DirectoryBrowser {
    public DirectoryBrowser() {
    }

    public List<String> listContent(Path path) throws IOException {
        List<String> directoryContent = new LinkedList<>();
        if(Files.isDirectory(path)){
            DirectoryStream<Path> stream = Files.newDirectoryStream(path);
                for(Path file: stream){
                    directoryContent.add(file.getFileName().toString());
                }
            } else {
            System.out.println(path+" is not a directory.");
        }
        return directoryContent;
    }

}
