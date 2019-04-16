package com.clouway;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileLinesDataSource implements LinesDataSource{
    Path path;

    /**
     * Constructor
     * @param path file to read from
     */
    public FileLinesDataSource(Path path) {
        this.path = path;
    }

    /**
     * Reads lines from file 'path'
     * @return lines contained in file in List<String>
     */
    @Override
    public List<String> getLines() {
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(String.format("Unable to read from %s due:%s", path, e.getCause()));
        }
    }
}
