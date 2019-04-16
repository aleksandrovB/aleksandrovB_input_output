package com.clouway;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileWriter {
    public FileWriter() {
    }

    public void createNewFile(Path path, LinesDataSource linesDataSource) throws IOException {
        List<String> lines = linesDataSource.getLines();
        if(Files.isDirectory(path)){
            path = path.resolve(lines.get(0)+".txt");
            new File(path.toString(), lines.get(0));
            lines.remove(0);
        }
        Files.write(path,lines);
    }
}
