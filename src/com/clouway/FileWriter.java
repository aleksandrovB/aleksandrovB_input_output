package com.clouway;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileWriter {
    public FileWriter() {
    }

    /**
     * Creates new file if given path is directory. Uses first line in data source to choose filename
     * @param path directory where new file is being created
     * @param linesDataSource list of strings which will be written in file
     */
    public void createNewFile(Path path, LinesDataSource linesDataSource) {
        List<String> lines = linesDataSource.getLines();
        if(Files.isDirectory(path)){
            path = path.resolve(lines.get(0)+".txt");
            new File(path.toString(), lines.get(0));
            lines.remove(0);
        }
        try {
            Files.write(path,lines);
        } catch (IOException e) {
            throw new RuntimeException("Unable to write in " + path + " due: " +  e.getMessage());
        }
    }
}
